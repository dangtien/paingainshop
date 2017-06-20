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
}

