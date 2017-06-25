package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import paingainshop.model.DBconnect;
import paingainshop.model.NhanVien;
import paingainshop.model.NhatKi;

public class NhatKiDAO {
	DBconnect db;
    ResultSet rs;

    public NhatKiDAO() {
        db = new DBconnect();
    }
    public String getLastPkey() throws Exception {
        String sql = "select MaNK from NhatKi order by MaNK DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value = null;
        while (rs.next()) {
            value = rs.getString("MaNK");
        }
        return value;
    }
    public ArrayList<NhatKi> getAll() throws Exception{
		 ArrayList<NhatKi> lst = new ArrayList<NhatKi>();
		 String strSQL = "select * from NhatKi where Ngay = curdate() order by MaNK desc ";
		 
		 try {
			 rs = db.getStatement().executeQuery(strSQL);
			 while(rs.next()){
			 
				 String MaNK = rs.getString("MaNK");
				 String Ngay=rs.getString("Ngay");
				 String Gio=rs.getString("Gio");
				 String ND= rs.getString("NoiDung");
				 
				 NhatKi nk = new NhatKi(MaNK,Ngay,Gio,ND);
				 lst.add(nk);
		 }
		 } catch (Exception e) 
		 {
			 System.out.println("Loi truy van CSDL.");
		 }
		 db.closeConnet();
		 return lst;
		 }
    	
    public boolean insertNhatKi(NhatKi nk) throws Exception
	 {
		 String sql = "insert into NhatKi values (?,?,?,?)";
		 PreparedStatement pst = db.openConnect().prepareStatement(sql);
		 pst.setString(1, nk.getMaNK());
		 pst.setString(2, nk.getNgay());
		 pst.setString(3, nk.getGio());
		 pst.setString(4, nk.getNoiDung());
		 
		 return pst.executeUpdate()>0;
	 }
}
