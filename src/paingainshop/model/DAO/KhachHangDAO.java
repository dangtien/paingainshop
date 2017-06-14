/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import paingainshop.model.DBconnect;
import paingainshop.model.KhachHang;

/**
 *
 * @author dangt
 */
public class KhachHangDAO {

    DBconnect db;
    ResultSet rs;

    public KhachHangDAO() {
        db = new DBconnect();
    }

    public String getLastPkey() throws Exception {
        String sql = "select MaKH from KhachHang order by MaKH DESC Limit 1";
        ResultSet rs = db.getStatement().executeQuery(sql);
        String value = null;
        while (rs.next()) {
            value = rs.getString("MaKH");
        }
        return value;
    }

    public boolean insertKhachHang(KhachHang kh) throws Exception {
        String sql = "insert into KhachHang values (?,?,?,?,?)";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, kh.getMaKH());
        pst.setString(2, kh.getTenHK());
        pst.setString(3, kh.getDiaChi());
        pst.setString(4, kh.getSoDT());
        pst.setString(5, kh.getEmail());

        return pst.executeUpdate() > 0;
    }

    public ArrayList<KhachHang> getAllCustomer() throws Exception {
        ArrayList<KhachHang> lst = new ArrayList<KhachHang>();
        String strSQL = "select * from KhachHang order by MaKH";

        try {
            rs = db.getStatement().executeQuery(strSQL);
            while (rs.next()) {

                String ID = rs.getString("MaKH");
                String Name = rs.getString("TenKH");
                String Address = rs.getString("DiaChi");
                String SDT = rs.getString("SoDT");
                String Email = rs.getString("Email");

                KhachHang kh = new KhachHang(ID, Name, Address, SDT, Email);
                lst.add(kh);
            }
        } catch (Exception e) {
            System.out.println("Loi truy van CSDL.");
        }
        db.closeConnet();
        return lst;
    }

    public KhachHang getByID(String MaKH) throws Exception {
        String sql = "select * from KhachHang where MaKH=?";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, MaKH);
        rs = pst.executeQuery();
        KhachHang kh = null;
        while (rs.next()) {
            String ID = rs.getString("MaKH");
            String Name = rs.getString("TenKH");
            String Address = rs.getString("DiaChi");
            String SDT = rs.getString("SoDT");
            String Email = rs.getString("Email");

            kh = new KhachHang(ID, Name, Address, SDT, Email);
        }
        return kh;
    }

    public boolean updateKhachHang(String ID, KhachHang newkh) throws Exception {
        String sql = "update KhachHang set TenKH=? , DiaChi=? , SoDT=? , Email=? where MaKH =?";
        PreparedStatement pst = db.openConnect().prepareStatement(sql);
        pst.setString(1, newkh.getTenHK());
        pst.setString(2, newkh.getDiaChi());
        pst.setString(3, newkh.getSoDT());
        pst.setString(4, newkh.getEmail());
        pst.setString(5, newkh.getMaKH());
        return pst.executeUpdate() > 0;

    }

    public ArrayList<KhachHang> getLikeString(String str) throws Exception {
        ArrayList<KhachHang> list;
        list = new ArrayList<KhachHang>();
        String sql = "Select * from KhachHang where TenKH like '%" + str + "%'";
        ResultSet rs = db.getStatement().executeQuery(sql);
        while (rs.next()) {
            String ID = rs.getString("MaKH");
            String Name = rs.getString("TenKH");
            String Address = rs.getString("DiaChi");
            String SDT = rs.getString("SoDT");
            String Email = rs.getString("Email");

            KhachHang kh = new KhachHang(ID, Name, Address, SDT, Email);
            list.add(kh);
        }
        return list;
    }
    public void close() throws SQLException{
    db.closeConnet();
    }
}
