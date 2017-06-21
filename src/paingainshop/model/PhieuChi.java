package paingainshop.model;

import java.text.SimpleDateFormat;
import java.util.Date;
public class PhieuChi {
	private String MaPC;
	private String Ngay;
	private String  LoaiChi;
	private String NguoiNhan;
	private int GiaTri;
	private String GhiChu;
	private String MaNV;
	public PhieuChi(String maPC, String ngay, String loaiChi, String nguoiNhan, int giaTri, String ghiChu, String maNV) {
		
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

    public String getNgay() {
        return Ngay;
    }

    public String getLoaiChi() {
        return LoaiChi;
    }

    public String getNguoiNhan() {
        return NguoiNhan;
    }

    public int getGiaTri() {
        return GiaTri;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaPC(String MaPC) {
        this.MaPC = MaPC;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public void setLoaiChi(String LoaiChi) {
        this.LoaiChi = LoaiChi;
    }

    public void setNguoiNhan(String NguoiNhan) {
        this.NguoiNhan = NguoiNhan;
    }

    public void setGiaTri(int GiaTri) {
        this.GiaTri = GiaTri;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
	
	
	
}
