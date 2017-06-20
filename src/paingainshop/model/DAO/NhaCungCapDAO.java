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
import paingainshop.model.KhachHang;
import paingainshop.model.NhaCungCap;
/**
 *
 * @author dangt
 */
public class NhaCungCapDAO {
    DBconnect db;
    ResultSet rs;

    public NhaCungCapDAO() {
        db = new DBconnect();
    }
    public String getLastPkey() throws Exception{
        String sql = "select MaNCC from nhacc order by MaNCC DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value=null;
        while(rs.next()){
             value= rs.getString("MaNCC");
        }
        return value;
    }
    public boolean insertNhaCungCap(NhaCungCap ncc) throws Exception {
        String sql = "insert into nhacc values (?,?,?,?,?,?,?)";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, ncc.getMaNCC());
        pst.setString(2, ncc.getTenNCC());
        pst.setString(3, ncc.getMaSoThue());
        pst.setString(4, ncc.getDiaChi());
        pst.setString(5, ncc.getSoDT());
        pst.setString(6, ncc.getEmail());
        pst.setString(7, ncc.getGhiChu());

        return pst.executeUpdate() > 0;
    }
    public ArrayList<NhaCungCap> getAll() throws Exception {
        ArrayList<NhaCungCap> lst = new ArrayList<NhaCungCap>();
        String strSQL = "select * from nhacc order by MaNCC";

        try {
            rs = db.getStatement().executeQuery(strSQL);
            while (rs.next()) {

                String ID = rs.getString("MaNCC");
                String Ten = rs.getString("TenNCC");
                String MaThue = rs.getString("Masothue");
                String DiaChi = rs.getString("DiaChi");
                String SDT = rs.getString("soDT");
                String Email = rs.getString("Email");
                String GhiChu = rs.getString("GhiChu");
                NhaCungCap ncc = new NhaCungCap(ID,Ten, MaThue,DiaChi, SDT, Email,GhiChu);
                lst.add(ncc);
            }
        } catch (Exception e) {
            System.out.println("Loi truy van CSDL.");
        }
        db.closeConnet();
        return lst;
    }
    
    public boolean updateNhaCungCap(String ID, NhaCungCap ncc) throws Exception {
        String sql = "update nhacc set TenNCC=? ,Masothue=? , DiaChi=? , soDT=?, Email =?, GhiChu=? where MaNCC =? ";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        
        pst.setString(1, ncc.getTenNCC());
        pst.setString(2, ncc.getMaSoThue());
        pst.setString(3, ncc.getDiaChi());
        pst.setString(4, ncc.getSoDT());
        pst.setString(5, ncc.getEmail());
        pst.setString(6, ncc.getGhiChu());
        pst.setString(7, ncc.getMaNCC());
        return pst.executeUpdate() > 0;

    }
    
    public NhaCungCap getByID(String MaNCC) throws Exception
    {
    	String sql = "select * from nhacc where MaNCC=?";
    	PreparedStatement pst = db.openConnect().prepareStatement(sql);
    	pst.setString(1, MaNCC);
    	rs = pst.executeQuery();
    	NhaCungCap ncc = null;
    	while (rs.next())
    	{
    		String ID = rs.getString("MaNCC");
            String Ten = rs.getString("TenNCC");
            String MaThue = rs.getString("Masothue");
            String DiaChi = rs.getString("DiaChi");
            String SDT = rs.getString("soDT");
            String Email = rs.getString("Email");
            String GhiChu = rs.getString("GhiChu");
            ncc = new NhaCungCap(ID,Ten, MaThue,DiaChi, SDT, Email,GhiChu);
    	}
    	return ncc;
    }
}
