/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	//dùng để đăng nhập
		 public NhanVien getUserByUserName(String UserName)throws Exception
		 {
			 String sql = "select * from NhanVien where UserName=?";
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
				 String UserNamem = rs.getString("UserName");
				 String Pass =rs.getString("Pass");
				 String GhiChu=rs.getString("GhiChu");
				 
				 nv = new NhanVien (MaNV,HoTen,Luong,Email,DiaChi,SoDT,UserNamem,Pass,GhiChu);
			 }
			 return nv;
                }
}
