package paingainshop.model;
import java.sql.*;
import java.util.*;



public class DBconnect {

	Connection conn =null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public Connection openConnect() throws Exception
	{
		try {
				 Class.forName("com.mysql.jdbc.Driver");
				 String DB_url = "jdbc:mysql://localhost:3306/da_qlbh";

				 this.conn = DriverManager.getConnection(DB_url,"root","root");


				 System.out.println("Ket noi Mysql thanh cong.");
			 } 
		catch (ClassNotFoundException e) {System.out.println("Ket noi Driver that bai!...." + e.getMessage());}
		catch (SQLException e) {System.out.println("Khong ket noi duoc CSDL.... " + e.getMessage());}
		 
		 return conn;
	}
	
	
	public Statement getStatement() throws SQLException, Exception
	{
		 
		stmt = openConnect().createStatement();
		 
		return stmt;
		 
	}
	
	
	public void closeConnet() throws SQLException{
		 if(rs != null && !rs.isClosed())
		 rs.close();
		 if(stmt != null)
		 stmt.close();
		 if(conn != null)
		 conn.close();
		 }
	
	public int executeUpdate(String strSQL) throws Exception
	{
		 int result = 0;
		 try 
		 {
			 result = getStatement().executeUpdate(strSQL);
		 } catch (Exception e) 
		 {
			 System.out.println( " Error at: " + strSQL);
		 }finally{
			 this.closeConnet();
		 }
		 return result;
		 
	}
	//dÃ¹ng Ä‘á»ƒ Ä‘Äƒng nháº­p
	 public NhanVien getUserByUserName(String UserName)throws Exception
	 {
		 String sql = "select * from NhanVien where UserName=?";
		 PreparedStatement pst = openConnect().prepareStatement(sql);
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
	 public boolean addNCC(NhaCungCap ncc) throws Exception
	 {
		 String sql = "insert into NhaCC values (?,?,?,?,?,?,?)";
		 PreparedStatement pst = openConnect().prepareStatement(sql);
		 pst .setString(1, ncc.getMaNCC());
		 pst.setString(2, ncc.getTenNCC());
		 pst.setString(3, ncc.getMaSoThue());
		 pst.setString(4, ncc.getDiaChi());
		 pst.setString(5, ncc.getSoDT());
		 pst.setString(6, ncc.getEmail());
		 pst.setString(7, ncc.getGhiChu());
		 
		 return pst.executeUpdate()>0;
	 }
	
	public boolean addNhanVien(NhanVien nv) throws Exception
	{
		String sql = "insert into NhanVien values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = openConnect().prepareStatement(sql);
		pst.setString(1, nv.getMaNV());
		pst.setString(2, nv.getHoTen());
		pst.setInt(3,nv.getLuong());
		pst.setString(4, nv.getEmail());
		pst.setString(5, nv.getDiaChi());
		pst.setString(6, nv.getSoDT());
		pst.setString(7, nv.getUserName());
		pst.setString(8, nv.getPass());
		pst.setString(9, nv.getGhiChu());
		return pst.executeUpdate()>0;
	}
	public boolean addHangHoa(HangHoa hh) throws Exception
	{
		String sql = "insert into HangHoa values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = openConnect().prepareStatement(sql);
		pst.setString(1, hh.getMaHH());
		pst.setString(2, hh.getTenHH());
		pst.setString(3, hh.getNhomHH());
		pst.setInt(4, hh.getGiaBan());
		pst.setInt(5, hh.getGiaNhap());
		pst.setString(6, hh.getThuocTinh());
		pst.setInt(7, hh.getSoLuong());
		pst.setString(8, hh.getDonViTinh());
		pst.setString(9, hh.getMaNCC());
		pst.setString(10, hh.getGhiChu());
		
		return pst.executeUpdate()>0;
	}
	public boolean addBCC(BangChamCong cc) throws Exception
	{
		String sql = "insert into BangChamCong values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = openConnect().prepareStatement(sql);
		pst.setInt(1, cc.getMaCC());
		pst.setString(2, cc.getNgay());
		pst.setTime(3, cc.getGioBD());
		pst.setTime(4, cc.getGioKT());
		pst.setInt(5, cc.getTienPhat());
		pst.setInt(6, cc.getPhucap());
		pst.setInt(7, cc.getTamung());
		pst.setInt(8, cc.getMaCa());
		pst.setString(9, cc.getMaNV());
		
		return pst.executeUpdate()>0;
	}
	
}

