/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import paingainshop.model.*;

/**
 *
 * @author dangt
 */
public class HoaDonDAO {
    DBconnect db;
    ResultSet rs;
    public HoaDonDAO() {
        db = new DBconnect();
    }
    public String getLastPkey() throws Exception{
        String sql = "select MaHD from HoaDon order by MaHD DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value=null;
        while(rs.next()){
             value= rs.getString("MaHD");
        }
        return value;
    }
    public boolean insertHoaDon(HoaDon hd) throws Exception{
        String sql = "insert into HoaDon values (?,?,?,?)";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, hd.getMaHD());
        pst.setString(2, hd.getNgay());
        pst.setString(3, hd.getMaKH());
        pst.setString(4, hd.getMaNV());
        return pst.executeUpdate()>0;
    }
    public ArrayList<HoaDon> getAll() throws Exception{
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "select * from hoadon";
        ResultSet rs = db.getStatement().executeQuery(sql);
        while(rs.next()){
            list.add(new HoaDon(rs.getString("MaHD"), rs.getString("Ngay"), rs.getString("MaKH"), rs.getString("MaNV")));
        }
        return list;
    }
    public HoaDon getById(String mahd) throws Exception{
        String sql = "select * from hoadon where MaHD=?";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, mahd);
        ResultSet rs = pst.executeQuery() ;
        HoaDon hd=null;
        while(rs.next()){
            hd = new HoaDon(rs.getString("MaHD"), rs.getString("Ngay"), rs.getString("MaKH"), rs.getString("MaNV"));
        }
        return hd;
    }
    public ArrayList<CountSoHoaDon> CoutSL() throws Exception
    {
    	ArrayList<CountSoHoaDon> lstt = new ArrayList<CountSoHoaDon>();
    	String sql ="select count(MaHD) as tongHD from hoadon where Ngay = curdate()";
    	try {
            rs = db.getStatement().executeQuery(sql);
            while (rs.next()) {

                int sl = rs.getInt("tongHD");
                
                CountSoHoaDon cnt = new CountSoHoaDon(sl);
                lstt.add(cnt);
            }
        } catch (Exception e) {
            System.out.println("Loi truy van CSDL.");
        }
        db.closeConnet();
        return lstt;
    }
}
