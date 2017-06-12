package paingainshop.model;


import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.util.Date;
public class HoaDon {
	private String MaHD;
	private String Ngay;
	private String MaKH;
	private String MaNV;
	public HoaDon(String maHD, String ngay, String maKH, String maNV) {
		
		this.MaHD = maHD;
		this.Ngay = ngay;
		this.MaKH = maKH;
		this.MaNV = maNV;
	}
	public String getMaHD() {
		return MaHD;
	}
	public void setMaHD(String maHD) {
		MaHD = maHD;
	}
	public String getNgay() {
		return Ngay;
	}
	public void setNgay(String ngay) {
		Ngay = ngay;
	}
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		MaKH = maKH;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
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
