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
				 this.conn = DriverManager.getConnection(DB_url,"root","a38511967@");
				 System.out.println("Káº¿t ná»‘i MySQL thÃ nh cÃ´ng!");
			 } 
		catch (ClassNotFoundException e) {System.out.println("Ket noi Driver that bai!...." + e.getMessage());}
		catch (SQLException e) {System.out.println("Khong ket noi duoc CSDL.... ");}
		 
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
	public boolean addKhachHang(KhachHang kh) throws Exception
	{
		String sql = "insert into KhachHang values (?,?,?,?,?)";
		PreparedStatement pst = openConnect().prepareStatement(sql);
		pst.setString(1, kh.getMaKH());
		pst.setString(2, kh.getTenHK());
		pst.setString(3, kh.getDiaChi());
		pst.setString(4, kh.getSoDT());
		pst.setString(5, kh.getEmail());
		
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
	public ArrayList<KhachHang> getAllCustomer() throws Exception{
		 ArrayList<KhachHang> lst = new ArrayList<KhachHang>();
		 String strSQL = "select * from KhachHang order by MaKH";
		 try {
			 rs = getStatement().executeQuery(strSQL);
			 while(rs.next()){
			 
			 String ID = rs.getString("MaKH");
			 String Name = rs.getString("TenKH");
			 String Address = rs.getString("DiaChi");
			 String SDT = rs.getString("SoDT");
			 String Email = rs.getString("Email");
			
			 KhachHang pq = new KhachHang(ID,Name,Address,SDT,Email);
			 lst.add(pq);
		 }
		 } catch (Exception e) 
		 {
			 System.out.println("Loi truy van CSDL.");
		 }
		 closeConnet();
		 return lst;
		 }
	public boolean UpdateUser(String ID,KhachHang newkh) throws Exception
	 {
		 String sql = "update KhachHang set TenKH=? , DiaChi=? , SoDT=? , Email=? where MaKH =?";
		 PreparedStatement pst = openConnect().prepareStatement(sql);
		 pst.setString(1, newkh.getTenHK());
		 pst.setString(2, newkh.getDiaChi());
		 pst.setString(3, newkh.getSoDT());
		 pst.setString(4, newkh.getEmail());
		 pst.setString(5, newkh.getMaKH());
		 return pst.executeUpdate()>0;
		 
	 }
}

