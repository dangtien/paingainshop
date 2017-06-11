package paingainshop.model;

import java.text.SimpleDateFormat;
import java.util.Date;
public class PhieuChi {
	private String MaPC;
	private Date Ngay;
	private String  LoaiChi;
	private String NguoiNhan;
	private int GiaTri;
	private String GhiChu;
	private String MaNV;
	public PhieuChi(String maPC, Date ngay, String loaiChi, String nguoiNhan, int giaTri, String ghiChu, String maNV) {
		
		this.MaPC = maPC;
		this.Ngay = ngay;
		this.LoaiChi = loaiChi;
		this.NguoiNhan = nguoiNhan;
		this.GiaTri = giaTri;
		this.GhiChu = ghiChu;
		this.MaNV = maNV;
	}
	public String getMaPC() {
		return MaPC;
	}
	public void setMaPC(String maPC) {
		MaPC = maPC;
	}
	public Date getNgay() {
		return Ngay;
	}
	public void setNgay(Date ngay) {
		Ngay = ngay;
	}
	public String getLoaiChi() {
		return LoaiChi;
	}
	public void setLoaiChi(String loaiChi) {
		LoaiChi = loaiChi;
	}
	public String getNguoiNhan() {
		return NguoiNhan;
	}
	public void setNguoiNhan(String nguoiNhan) {
		NguoiNhan = nguoiNhan;
	}
	public int getGiaTri() {
		return GiaTri;
	}
	public void setGiaTri(int giaTri) {
		GiaTri = giaTri;
	}
	public String getGhiChu() {
		return GhiChu;
	}
	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
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
