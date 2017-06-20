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

import paingainshop.model.NhanVien;

/**
 *
 * @author dangt
 */
public class NhanVienDAO {

    DBconnect db;
    ResultSet rs;

    public NhanVienDAO() {
        db = new DBconnect();
    }

    public String getLastPkey() throws Exception {
        String sql = "select MaNV from NhanVien order by MaNV DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value = null;
        while (rs.next()) {
            value = rs.getString("MaNV");
        }
        return value;
    }

    
    public ArrayList<NhanVien> getAll() throws Exception{
		 ArrayList<NhanVien> lst = new ArrayList<NhanVien>();
		 String strSQL = "select * from NhanVien where TrangThai='' order by MaNV  ";
		 
		 try {
			 rs = db.getStatement().executeQuery(strSQL);
			 while(rs.next()){
			 
				 String MaNV = rs.getString("MaNV");
				 String HoTen=rs.getString("HoTen");
				 int Luong =rs.getInt("Luong");
				 String Email= rs.getString("Email");
				 String DiaChi=rs.getString("DiaChi");
				 String SoDT=rs.getString("SoDT");
				 String UserNamem = rs.getString("UserName");
				 String Pass =rs.getString("Pass");
				 String GhiChu=rs.getString("GhiChu");
				 String TrangThai=rs.getString("TrangThai");
				 NhanVien nv = new NhanVien (MaNV,HoTen,Luong,Email,DiaChi,SoDT,UserNamem,Pass,GhiChu,TrangThai);
				 lst.add(nv);
		 }
		 } catch (Exception e) 
		 {
			 System.out.println("Loi truy van CSDL.");
		 }
		 db.closeConnet();
		 return lst;
		 }
    
    
	//dung de dang nhap
		 public NhanVien getUserByUserName(String UserName)throws Exception
		 {
			 String sql = "select * from NhanVien where Username=?";
			 PreparedStatement pst = db.openConnect().prepareStatement(sql);
			 pst.setString(1, UserName);
			 rs = pst.executeQuery();
			 NhanVien nv = null;
			 if(rs.next())
			 {
				
				 
				 String MaNV = rs.getString("MaNV");
				 String HoTen=rs.getString("HoTen");
				 int Luong =rs.getInt("Luong");
				 String Email= rs.getString("Email");
				 String DiaChi=rs.getString("DiaChi");
				 String SoDT=rs.getString("SoDT");
				 String UserNamem = rs.getString("Username");
				 String Pass =rs.getString("Pass");
				 String GhiChu=rs.getString("GhiChu");
				 String TrangThai=rs.getString("TrangThai");
				 nv = new NhanVien (MaNV,HoTen,Luong,Email,DiaChi,SoDT,UserNamem,Pass,GhiChu,TrangThai);
			 }
			 return nv;
          }
		 
		 
		 public boolean insertNhanVien(NhanVien nv) throws Exception
		 {
			 String sql = "insert into NhanVien values (?,?,?,?,?,?,?,?,?,?)";
			 PreparedStatement pst = db.openConnect().prepareStatement(sql);
			 pst.setString(1,nv.getMaNV() );
			 pst.setString(2, nv.getHoTen());
			 pst.setInt(3, nv.getLuong());
			 pst.setString(4,nv.getEmail() );
			 pst.setString(5,nv.getDiaChi() );
			 pst.setString(6,nv.getSoDT() );
			 pst.setString(7,nv.getUserName() );
			 pst.setString(8,nv.getPass() );
			 pst.setString(9,nv.getGhiChu() );
			 pst.setString(10,nv.getTrangThai() );
			 return pst.executeUpdate()>0;
		 }
		 
		 public boolean updateNhanVien (String manv,NhanVien nv) throws Exception
		 {
			 String sql  = "update NhanVien set HoTen=?, Luong = ?,Email=?,DiaChi=?,SoDT=?,Username=?,Pass=?,GhiChu=?,TrangThai=? where MaNV=?";
			 PreparedStatement pst = db.openConnect().prepareStatement(sql);
			 
			 pst.setString(1, nv.getHoTen());
			 pst.setInt(2, nv.getLuong());
			 pst.setString(3,nv.getEmail() );
			 pst.setString(4,nv.getDiaChi() );
			 pst.setString(5,nv.getSoDT() );
			 pst.setString(6,nv.getUserName() );
			 pst.setString(7,nv.getPass() );
			 pst.setString(8,nv.getGhiChu() );
			 pst.setString(9,nv.getTrangThai() );
			 pst.setString(10,nv.getMaNV() );
			 
			 return pst.executeUpdate()>0;
		 }
		 
		 public boolean deleteNhanVien(String MaNV) throws Exception{
			 String sql = "delete from NhanVien where MaNV = ?";
			 PreparedStatement pst = db.openConnect().prepareStatement(sql);
			 pst.setString(1, MaNV);
			 return pst.executeUpdate() > 0;
			 }
		 
		 public NhanVien getUserByID(String UserName)throws Exception
		 {
			 String sql = "select * from NhanVien where MaNV=?";
			 PreparedStatement pst = db.openConnect().prepareStatement(sql);
			 pst.setString(1, UserName);
			 rs = pst.executeQuery();
			 NhanVien nv = null;
			 if(rs.next())
			 {
				
				 
				 String MaNV = rs.getString("MaNV");
				 String HoTen=rs.getString("HoTen");
				 int Luong =rs.getInt("Luong");
				 String Email= rs.getString("Email");
				 String DiaChi=rs.getString("DiaChi");
				 String SoDT=rs.getString("SoDT");
				 String UserNamem = rs.getString("Username");
				 String Pass =rs.getString("Pass");
				 String GhiChu=rs.getString("GhiChu");
				 String TrangThai=rs.getString("TrangThai");
				 nv = new NhanVien (MaNV,HoTen,Luong,Email,DiaChi,SoDT,UserNamem,Pass,GhiChu,TrangThai);
			 }
			 return nv;
          }
		 
		
		

}
