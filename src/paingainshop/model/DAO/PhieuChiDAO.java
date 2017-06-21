/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import paingainshop.model.DBconnect;
import paingainshop.model.*;

/**
 *
 * @author dangt
 */
public class PhieuChiDAO {
    DBconnect db ;

    public PhieuChiDAO() {
        db = new DBconnect();
    }
    public String getLastPkey() throws Exception{
        String sql = "select MaPC from phieuchi order by MaPC DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value=null;
        while(rs.next()){
             value= rs.getString("MaPC");
        }
        return value;
    }
    public ArrayList<PhieuChi> getAll() throws Exception{
        ArrayList<PhieuChi> list;
        list = new ArrayList<PhieuChi>();
        String sql = "Select * from phieuchi";
        ResultSet rs = db.getStatement().executeQuery(sql);
        while(rs.next()){
            String MaPC = rs.getString("MaPC");
            String Ngay = rs.getString("Ngay");
            String LoaiChi = rs.getString("LoaiChi");
            String NguoiNhan = rs.getString("NguoiNhan");
            int GiaTri = rs.getInt("GiaTri");
            String GhiChu = rs.getString("GhiChu");
            String MaNV = rs.getString("MaNV");

            PhieuChi pc = new PhieuChi(MaPC, Ngay, LoaiChi, NguoiNhan, GiaTri, GhiChu, MaNV);
            list.add(pc);
        }
        return list;
    }
    public PhieuChi getById(String MaH) throws Exception{
        String sql = "select * from phieuchi where MaPC=?";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, MaH);
        ResultSet rs = pst.executeQuery();
        PhieuChi pc = null;
        while(rs.next()){
            String MaPC = rs.getString("MaPC");
            String Ngay = rs.getString("Ngay");
            String LoaiChi = rs.getString("LoaiChi");
            String NguoiNhan = rs.getString("NguoiNhan");
            int GiaTri = rs.getInt("GiaTri");
            String GhiChu = rs.getString("GhiChu");
            String MaNV = rs.getString("MaNV");

            pc = new PhieuChi(MaPC, Ngay, LoaiChi, NguoiNhan, GiaTri, GhiChu, MaNV);
        }
        return pc;
    }
    public static void main(String args[]) throws Exception
    {
       PhieuChi pc = new PhieuChiDAO().getById("PC000001");
      System.out.print(pc.getMaNV()) ;
    }
            
}
