/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.DAO;

import java.sql.ResultSet;
import paingainshop.model.DBconnect;

/**
 *
 * @author dangt
 */
public class DonDatHangDAO {
    private DBconnect db;
    public DonDatHangDAO(){
        db = new DBconnect();
    }
    public String getLastPkey() throws Exception{
        String sql = "select MaDDH from dondathang order by MaDDH DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value=null;
        while(rs.next()){
             value= rs.getString("MaDDH");
        }
        return value;
    }
}
