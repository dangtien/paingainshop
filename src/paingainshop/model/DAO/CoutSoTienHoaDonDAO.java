package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import paingainshop.model.CoutSoTienHoaDon;
import paingainshop.model.DBconnect;

public class CoutSoTienHoaDonDAO {
	DBconnect db;
    ResultSet rs;

    public CoutSoTienHoaDonDAO() {
        db = new DBconnect();
    }
    public CoutSoTienHoaDon getSoTienByID(String ID)throws Exception
	 {
		 String sql = " select sum(cthoadon.SoLuong*cthoadon.DonGia)-cthoadon.GiamGia as TongTien from hoadon join cthoadon on hoadon.MaHD = cthoadon.MaHD where hoadon.MaKH like  ?";
		 PreparedStatement pst = db.openConnect().prepareStatement(sql);
		 pst.setString(1, ID);
		 rs = pst.executeQuery();
		 CoutSoTienHoaDon nvcs = null;
		 if(rs.next())
		 {
			
			 int tongtien =rs.getInt("TongTien");
			 
			 
			 nvcs = new CoutSoTienHoaDon(tongtien);
		 }
		 return nvcs;
	 }
}
