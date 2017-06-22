/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.sql.ResultSet;
import paingainshop.model.DBconnect;
import paingainshop.model.*;

/**
 *
 * @author dangt
 */
public class DonDatHangDAO {

    private DBconnect db;
    private ResultSet rs;

    public DonDatHangDAO() {
        db = new DBconnect();
    }

    public String getLastPkey() throws Exception {
        String sql = "select MaDDH from dondathang order by MaDDH DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value = null;
        while (rs.next()) {
            value = rs.getString("MaDDH");
        }
        return value;
    }

    public boolean insertDonDatHang(DonDatHang ddh) throws Exception {
        String sql = "insert into dondathang values (?,?,?,?)";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, ddh.getMaDDH());
        pst.setString(2, ddh.getNgay());
        pst.setString(3, ddh.getMaNV());
        pst.setInt(4, ddh.isTrangThai());

        return pst.executeUpdate() > 0;
    }

    public ArrayList<DonDatHang> getAll() throws Exception {
        ArrayList<DonDatHang> lst = new ArrayList<DonDatHang>();
        String strSQL = "select * from dondathang order by MaDDH";

        try {
            rs = db.getStatement().executeQuery(strSQL);
            while (rs.next()) {

                String ma = rs.getString("MaDDH");
                String ngay = rs.getString("Ngay");
                String manv = rs.getString("MaNV");
                int tt = rs.getInt("TrangThai");

                DonDatHang ddh = new DonDatHang(ma, ngay, manv, tt);
                lst.add(ddh);
            }
        } catch (Exception e) {
            System.out.println("Loi truy van CSDL.");
        }
        db.closeConnet();
        return lst;
    }

    public DonDatHang getById(String madh) throws Exception {
        String sql = "select * from dondathang where MaDDH=?";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, madh);
        rs = pst.executeQuery();
        DonDatHang dh = null;
        while (rs.next()) {
            String ma = rs.getString("MaDDH");
            String ngay = rs.getString("Ngay");
            String manv = rs.getString("MaNV");
            int tt = rs.getInt("TrangThai");

            dh = new DonDatHang(ma, ngay, manv, tt);
        }
        return dh;
    }

    public boolean updateDonDatHang(DonDatHang ddh) throws Exception {
        String sql = "update dondathang set Ngay=?, MaNV=?, TrangThai=? where MaDDH =? ";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);

        pst.setString(1, ddh.getNgay());
        pst.setString(2, ddh.getMaNV());
        pst.setInt(3, ddh.isTrangThai());
        pst.setString(4, ddh.getMaDDH());

        return pst.executeUpdate() > 0;

    }

    public ArrayList<CountDDH> CoutDDH() throws Exception {
        ArrayList<CountDDH> lstt = new ArrayList<CountDDH>();
        String sql = "select count(MaDDH) as tongDDH from dondathang where Ngay = curdate()";
        try {
            rs = db.getStatement().executeQuery(sql);
            while (rs.next()) {

                int tong = rs.getInt("tongDDH");

                CountDDH cnt = new CountDDH(tong);
                lstt.add(cnt);
            }
        } catch (Exception e) {
            System.out.println("Loi truy van CSDL.");
        }
        db.closeConnet();
        return lstt;
    }
}
