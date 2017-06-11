package paingainshop.model;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DonDatHang {
	private String MaDDH;
	private Date Ngay;
	private String MaNV;
	private boolean TrangThai;
	public DonDatHang(String maDDH, Date ngay, String maNV, boolean trangThai) {
		
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
	public Date getNgay() {
		return Ngay;
	}
	public void setNgay(Date ngay) {
		Ngay = ngay;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public boolean isTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(boolean trangThai) {
		TrangThai = trangThai;
	}
	
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
	
}
