/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import paingainshop.model.DBconnect;
import paingainshop.model.HoaDon;

/**
 *
 * @author dangt
 */
public class HoaDonDAO {
    DBconnect db;

    public HoaDonDAO() {
        db = new DBconnect();
    }
    public String getLastPkey() throws Exception{
        String sql = "select MaHD from HoaDon order by MaHD DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value=null;
        while(rs.next()){
             value= rs.getString("MaHD");
        }
        return value;
    }
    public boolean insertHoaDon(HoaDon hd) throws Exception{
        String sql = "insert into HoaDon values (?,?,?,?)";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, hd.getMaHD());
        pst.setString(2, hd.getNgay());
        pst.setString(3, hd.getMaKH());
        pst.setString(4, hd.getMaNV());
        return pst.executeUpdate()>0;
    }       
}
