/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import paingainshop.model.CTHoaDon;
import paingainshop.model.DBconnect;

/**
 *
 * @author dangt
 */
public class CTHoaDonDAO {
    DBconnect db;
    public CTHoaDonDAO(){
        db = new DBconnect();
    }
    public boolean insertCTHoaDon(CTHoaDon ct) throws Exception{
        String sql ="insert into cthoadon value (?,?,?,?,?)";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, ct.getMaHD());
        pst.setString(2, ct.getMaHH());
        pst.setInt(3, ct.getSoLuong());
        pst.setInt(4, ct.getDonGia());
        pst.setInt(5, ct.getGiamGia());
        return pst.executeUpdate()>0;
    }
    public ArrayList<CTHoaDon> getById(String mahd) throws Exception{
        String sql ="select * from cthoadon where MaHD=?";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, mahd);
        ArrayList<CTHoaDon> list = new ArrayList<CTHoaDon>();
        
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            list.add(new CTHoaDon(rs.getString("MaHD"), rs.getString("MaHH"), rs.getInt("SoLuong"), rs.getInt("DonGia"), rs.getInt("GiamGia")));
        }
        return list;
    }
}
