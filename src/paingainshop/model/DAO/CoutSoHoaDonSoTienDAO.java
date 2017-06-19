package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import paingainshop.model.DBconnect;

import paingainshop.model.CoutSoHoaDonSoTien;
public class CoutSoHoaDonSoTienDAO {
	DBconnect db;
    ResultSet rs;

    public CoutSoHoaDonSoTienDAO() {
        db = new DBconnect();
    }
    public CoutSoHoaDonSoTien getSoHDByID(String ID)throws Exception
	 {
		 String sql = " Select count(hoadon.makh) as tongHD from hoadon where MaKH like ?";
		 PreparedStatement pst = db.openConnect().prepareStatement(sql);
		 pst.setString(1, ID);
		 rs = pst.executeQuery();
		 CoutSoHoaDonSoTien nvc = null;
		 if(rs.next())
		 {
			
			 int soHD =rs.getInt("tongHD");
			 
			 
			 nvc = new CoutSoHoaDonSoTien(soHD);
		 }
		 return nvc;
	 }
	public static void main(String[] args) throws Exception {
		CoutSoHoaDonSoTien cs = new CoutSoHoaDonSoTienDAO().getSoHDByID("KH000014");
		System.out.println(cs.getSoHoaDon());
	}
    
}
