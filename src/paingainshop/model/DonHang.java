/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model;

import java.util.ArrayList;

/**
 *
 * @author Mạnh Nguyễn!
 */
public class DonHang extends DonDatHang {

    private ArrayList<CTDonDatHang> items;

    public DonHang(String maDDH, String ngay, String maNV, boolean trangThai) {
        super(maDDH, ngay, maNV, trangThai);
        items = new ArrayList<>();
    }

    public ArrayList<CTDonDatHang> getItems() {
        return items;
    }

    public int isDuplicate(CTDonDatHang ctd) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(ctd)) {
                return i;
            }
        }
        return -1;
    }

    public void addItem(CTDonDatHang item) {
        int index = isDuplicate(item);
        if (index != -1) {
            CTDonDatHang tmp = items.get(index);
            items.get(index).setSoLuong(tmp.getSoLuong() + item.getSoLuong());
        } else {
            items.add(item);
        }
    }

    public void remove(CTDonDatHang item) {
        if (!this.items.isEmpty()) {
            items.remove(item);
        }
    }

    public CTDonDatHang getItem(String mahh) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getMaHH().equals(mahh)) {
                return items.get(i);
            }
        }
        return null;
    }

    public void update(CTDonDatHang item) {
        int index = isDuplicate(item);
        if (index != -1) {
            items.get(index).setSoLuong(item.getSoLuong());
            items.get(index).setDonGia(item.getDonGia());
        }
    }
}
