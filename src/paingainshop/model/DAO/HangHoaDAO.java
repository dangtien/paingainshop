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
import paingainshop.model.HangHoa;

/**
 *
 * @author dangt
 */
public class HangHoaDAO {
    DBconnect db;

    public HangHoaDAO() {
        db = new DBconnect();
    }
    public String getLastPkey() throws Exception{
        String sql = "select MaHH from HangHoa order by MaHH DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value=null;
        while(rs.next()){
             value= rs.getString("MaHH");
        }
        return value;
    }
    public boolean insertHangHoa(HangHoa newhh) throws Exception{
        String sql = "insert into HangHoa values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = db.openConnect().prepareStatement(sql);
		pst.setString(1, newhh.getMaHH());
		pst.setString(2, newhh.getTenHH());
		pst.setString(3, newhh.getNhomHH());
		pst.setInt(4, newhh.getGiaBan());
		pst.setInt(5, newhh.getGiaNhap());
		pst.setString(6, newhh.getThuocTinh());
		pst.setInt(7, newhh.getSoLuong());
		pst.setString(8, newhh.getDonViTinh());
		pst.setString(9, newhh.getMaNCC());
		pst.setString(10, newhh.getGhiChu());
		return pst.executeUpdate()>0;
    }
    public ArrayList<HangHoa> getAll() throws Exception{
        ArrayList<HangHoa> list;
        list = new ArrayList<HangHoa>();
        String sql = "Select * from HangHoa";
        ResultSet rs = db.getStatement().executeQuery(sql);
        while(rs.next()){
            String MaHH = rs.getString("MaHH");
            String TenHH = rs.getString("TenHH");
            String NhomHH = rs.getString("NhomHH");
            int SoLuong = rs.getInt("SoLuong");
            int GiaBan = rs.getInt("GiaBan");
            int GiaNhap = rs.getInt("GiaNhap");
            String ThuocTinh = rs.getString("ThuocTinh");
            String DonViTinh = rs.getString("DonViTinh");
            String MaNCC = rs.getString("MaNCC");
            String GhiChu = rs.getString("GhiChu");
            HangHoa sp = new HangHoa(MaHH, TenHH, NhomHH, GiaBan, GiaNhap, ThuocTinh, SoLuong, DonViTinh, MaNCC, GhiChu);
            list.add(sp);
        }
        return list;
    }
    public HangHoa getById(String MaH) throws Exception{
        String sql = "select * from HangHoa where MaHH=?";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, MaH);
        ResultSet rs = pst.executeQuery();
        HangHoa hh = null;
        while(rs.next()){
            String MaHH = rs.getString("MaHH");
            String TenHH = rs.getString("TenHH");
            String NhomHH = rs.getString("NhomHH");
            int SoLuong = rs.getInt("SoLuong");
            int GiaBan = rs.getInt("GiaBan");
            int GiaNhap = rs.getInt("GiaNhap");
            String ThuocTinh = rs.getString("ThuocTinh");
            String DonViTinh = rs.getString("DonViTinh");
            String MaNCC = rs.getString("MaNCC");
            String GhiChu = rs.getString("GhiChu");
            hh = new HangHoa(MaHH, TenHH, NhomHH, GiaBan, GiaNhap, ThuocTinh, SoLuong, DonViTinh, MaNCC, GhiChu);
        }
        return hh;
    }
    public boolean updateHangHoa(HangHoa newhh) throws Exception{
        String sql = "update  HangHoa Set TenHH =?, NhomHH=?, GiaBan=?,GiaNhap=?, ThuocTinh=?, SoLuong=?, DonViTinh=?, MaNCC=?, GhiChu=? where MaHH =?";
		PreparedStatement pst = db.openConnect().prepareStatement(sql);
		pst.setString(1, newhh.getTenHH());
		pst.setString(2, newhh.getNhomHH());
		pst.setInt(3, newhh.getGiaBan());
		pst.setInt(4, newhh.getGiaNhap());
		pst.setString(5, newhh.getThuocTinh());
		pst.setInt(6, newhh.getSoLuong());
		pst.setString(7, newhh.getDonViTinh());
		pst.setString(8, newhh.getMaNCC());
		pst.setString(9, newhh.getGhiChu());
                pst.setString(10, newhh.getMaHH());
		return pst.executeUpdate()>0;
    }
}
