package paingainshop.model;
import java.sql.Time;
public class BangChamCong {
	private int MaCC;
	private String Ngay;
	private String GioBD;
	private String GioKT;
	private int TienPhat;
	private int Phucap;
	private int Tamung;
	private int MaCa;
	private String MaNV;

	
	public BangChamCong(int MaCC, String Ngay, String GioBD, String GioKT, int TienPhat, int Phucap, int Tamung, String MaNV, int MaCa){
		this.MaCC = MaCC;
		this.Ngay = Ngay;
		this.GioBD = GioBD;
		this.GioKT = GioKT;
		this.TienPhat = TienPhat;
		this.Phucap = Phucap;
		this.Tamung = Tamung;
		this.MaCa = MaCa;
		this.MaNV = MaNV;
	}

	public int getMaCC() {
		return MaCC;
	}

	public void setMaCC(int maCC) {
		MaCC = maCC;
	}

	public String getNgay() {
		return Ngay;
	}

	public void setNgay(String ngay) {
		Ngay = ngay;
	}

	public String getGioBD() {
		return GioBD;
	}

	public void setGioBD(String gioBD) {
		GioBD = gioBD;
	}

	public String getGioKT() {
		return GioKT;
	}

	public void setGioKT(String gioKT) {
		GioKT = gioKT;
	}

	public int getTienPhat() {
		return TienPhat;
	}

	public void setTienPhat(int tienPhat) {
		TienPhat = tienPhat;
	}

	public int getPhucap() {
		return Phucap;
	}

	public void setPhucap(int phucap) {
		Phucap = phucap;
	}

	public int getTamung() {
		return Tamung;
	}

	public void setTamung(int tamung) {
		Tamung = tamung;
	}

	public int getMaCa() {
		return MaCa;
	}

	public void setMaCa(int maCa) {
		MaCa = maCa;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	
	
	
	
}
