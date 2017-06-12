/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public boolean addHangHoa(HangHoa hh) throws Exception
	{
		String sql = "insert into HangHoa values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = db.openConnect().prepareStatement(sql);
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
    public String getLastPkey() throws Exception{
        String sql = "select MaHH from HangHoa order by MaHH DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value=null;
        while(rs.next()){
             value= rs.getString("MaHH");
        }
        return value;
    }
}
