package paingainshop.model.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

import paingainshop.model.DBconnect;
import paingainshop.model.*;

public class BangTinhLuongDAO {
	
	DBconnect db;
    ResultSet rs;

    public BangTinhLuongDAO() {
        db = new DBconnect();
    }

	
	public ArrayList<BangTinhLuong> getInfoLuong() throws Exception {
        ArrayList<BangTinhLuong> lst = new ArrayList<BangTinhLuong>();
        String strSQL = "select	month(bangchamcong.Ngay) as Thang, year(bangchamcong.Ngay) as Nam, bangchamcong.MaNV, NhanVien.HoTen, ";
        strSQL += "sum(hour(bangchamcong.GioKT)-hour(bangchamcong.GioBD)) as tongGio,NhanVien.Luong, sum(bangchamcong.PhuCap) as PhuCap, ";
        strSQL += "sum(bangchamcong.TamUng) as TamUng, sum(bangchamcong.TienPhat) as TienPhat ";
        strSQL += "from bangchamcong join NhanVien on bangchamcong.MaNV= NhanVien.MaNV ";
        strSQL += "where month(bangchamcong.Ngay)= 4 and year (bangchamcong.Ngay) =2017 ";
        strSQL += "group by  bangchamcong.MaNV asc , year(bangchamcong.Ngay), month(bangchamcong.Ngay) "; 
        strSQL+= " order by bangchamcong.MaNV";

        try {
            rs = db.getStatement().executeQuery(strSQL);
            while (rs.next()) {

                int thang = rs.getInt("Thang");
                int nam = rs.getInt("Nam");
                String manv = rs.getString("MaNV");
                String ten = rs.getString("HoTen");
                int gio = rs.getInt("tongGio");
                int luong = rs.getInt("Luong");
                int phucap = rs.getInt("PhuCap");
                int tamung = rs.getInt("TamUng");
                int phat = rs.getInt("TienPhat");
                BangTinhLuong btl = new BangTinhLuong(thang,nam,manv,ten,gio,luong,phucap,tamung,phat);
                lst.add(btl);
            }
        } catch (Exception e) {
            System.out.println("Loi truy van CSDL.");
        }
        db.closeConnet();
        return lst;
    }
}
