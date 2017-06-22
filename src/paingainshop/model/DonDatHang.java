package paingainshop.model;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DonDatHang {
	private String MaDDH;
	private String Ngay;
	private String MaNV;
<<<<<<< HEAD
	private boolean TrangThai;
	public DonDatHang(String maDDH, String ngay, String maNV, boolean trangThai) {
=======
	private int TrangThai;
	public DonDatHang(String maDDH, String ngay, String maNV, int trangThai) {
>>>>>>> 81242299834971c98a919810fc3b6ad3a35e3637
		
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
	
<<<<<<< HEAD
=======
	/*
	 public static void main (String[] args)
	{
		Date x = new Date();
		System.out.println(x);
		@SuppressWarnings("deprecation")
		Date xx = new Date("10/20/2016");
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy/MM/dd");

			     System.out.println("Date hien tai: " + ft.format(x));
		//System.out.println(xx);
			     
	}
	 
	 */
>>>>>>> 81242299834971c98a919810fc3b6ad3a35e3637
}
