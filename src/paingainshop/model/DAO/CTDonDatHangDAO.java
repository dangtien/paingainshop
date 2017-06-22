/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import paingainshop.model.*;

/**
 *
 * @author dangt
 */
public class CTDonDatHangDAO {

    DBconnect db;
    ResultSet rs;

    public CTDonDatHangDAO() {
        db = new DBconnect();
    }

    public boolean insertCTDonDatHang(CTDonDatHang ctddh) throws Exception {
        String sql = "insert into ctdondathang values (?,?,?,?)";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, ctddh.getMaDDH());
        pst.setString(2, ctddh.getMaHH());
        pst.setInt(3, ctddh.getSoLuong());
        pst.setInt(4, ctddh.getDonGia());

        return pst.executeUpdate() > 0;
    }

    public boolean updateCTDonDatHang(CTDonDatHang ctddh) throws Exception {
        String sql = "update ctdondathang set MaHH=?, SoLuong=?, DonGia=? where MaDDH =? ";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);

        pst.setString(1, ctddh.getMaDDH());
        pst.setString(2, ctddh.getMaHH());
        pst.setInt(3, ctddh.getSoLuong());
        pst.setInt(4, ctddh.getDonGia());

        return pst.executeUpdate() > 0;

    }

    public ArrayList<CTDonDatHang> getByID(String MaDDH) throws Exception {
        String sql = "select * from ctdondathang where MaDDH=?";
        ArrayList<CTDonDatHang> list = new ArrayList<>();
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, MaDDH);
        rs = pst.executeQuery();

        while (rs.next()) {
            String madon = rs.getString("MaDDH");
            String MaHH = rs.getString("MaHH");
            int SL = rs.getInt("SoLuong");
            int DonGia = rs.getInt("DonGia");

            CTDonDatHang ctddh = new CTDonDatHang(madon, MaHH, SL, DonGia);
            list.add(ctddh);
        }
        return list;
    }

    public ArrayList<CountTongHangNhap> CoutSL() throws Exception {
        ArrayList<CountTongHangNhap> lstt = new ArrayList<CountTongHangNhap>();
        String sql = "select sum(ctdondathang.SoLuong) as TongHangNhap from ctdondathang join dondathang on ctdondathang.MaDDH = dondathang.MaDDH where dondathang.Ngay = curdate()";
        try {
            rs = db.getStatement().executeQuery(sql);
            while (rs.next()) {

                int sl = rs.getInt("TongHangNhap");

                CountTongHangNhap cnt = new CountTongHangNhap(sl);
                lstt.add(cnt);
            }
        } catch (Exception e) {
            System.out.println("Loi truy van CSDL.");
        }
        db.closeConnet();
        return lstt;
    }
}
