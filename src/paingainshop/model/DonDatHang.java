package paingainshop.model;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DonDatHang {
	private String MaDDH;
	private String Ngay;
	private String MaNV;
	private int TrangThai;
	public DonDatHang(String maDDH, String ngay, String maNV, int trangThai) {

		
		this.MaDDH = maDDH;
		this.Ngay = ngay;
		this.MaNV = maNV;
		this.TrangThai = trangThai;
	}
	public String getMaDDH() {
		return MaDDH;
	}
	public void setMaDDH(String maDDH) {
		MaDDH = maDDH;
	}
	public String getNgay() {
		return Ngay;
	}
	public void setNgay(String ngay) {
		Ngay = ngay;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public int isTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(int trangThai) {
		TrangThai = trangThai;
	}
}
