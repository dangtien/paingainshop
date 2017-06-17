package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.Time;
import java.sql.ResultSet;
import java.util.ArrayList;
import paingainshop.model.DBconnect;
import paingainshop.model.BangChamCong;

public class BangChamCongDAO {
	DBconnect db;

    public BangChamCongDAO() {
        db = new DBconnect();
    }
    
    public int getLastPkey() throws Exception{
        String sql = "select MaCC from BangChamCong order by MaCC DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        int value =0;
        while(rs.next()){
             value= rs.getInt("MaCC");
        }
        return value;
    }
    public boolean insertBCC(BangChamCong newcc) throws Exception{
        String sql = "insert into BangChamCong values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = db.openConnect().prepareStatement(sql);
		pst.setInt(1, newcc.getMaCC());
		pst.setString(2, newcc.getNgay());
		pst.setTime(3, newcc.getGioBD());
		pst.setTime(4, newcc.getGioKT());
		pst.setInt(5, newcc.getTienPhat());
		pst.setInt(6, newcc.getPhucap());
		pst.setInt(7, newcc.getTamung());
		pst.setInt(8, newcc.getMaCa());
		pst.setString(9, newcc.getMaNV());
		return pst.executeUpdate()>0;
    }
    public ArrayList<BangChamCong> getAll() throws Exception{
        ArrayList<BangChamCong> list;
        list = new ArrayList<BangChamCong>();
        String sql = "Select * from BangChamCong";
        ResultSet rs = db.getStatement().executeQuery(sql);
        while(rs.next()){
            int MaCC = rs.getInt("MaCC");
            String Ngay = rs.getString("Ngay");
            Time GioBD = rs.getTime("GioBD");
            Time GioKT = rs.getTime("GioKT");
            int TienPhat = rs.getInt("TienPhat");
            int Phucap = rs.getInt("Phucap");
            int Tamung = rs.getInt("Tamung");
            int MaCa = rs.getInt("MaCa");
            String MaNV = rs.getString("MaNV");
            BangChamCong cc = new BangChamCong(MaCC, Ngay, GioBD, GioKT, TienPhat, Phucap, Tamung, MaCa, MaNV);
            list.add(cc);
        }
        return list;
    }
    
}
