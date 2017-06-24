package paingainshop.model;

public class NhatKi {
	private String MaNK;
	private String Ngay;
	private String Gio;
	private String NoiDung;
	public NhatKi(String maNK, String ngay, String gio, String noiDung) {
		super();
		MaNK = maNK;
		Ngay = ngay;
		Gio = gio;
		NoiDung = noiDung;
	}
	public String getMaNK() {
		return MaNK;
	}
	public void setMaNK(String maNK) {
		MaNK = maNK;
	}
	public String getNgay() {
		return Ngay;
	}
	public void setNgay(String ngay) {
		Ngay = ngay;
	}
	public String getGio() {
		return Gio;
	}
	public void setGio(String gio) {
		Gio = gio;
	}
	public String getNoiDung() {
		return NoiDung;
	}
	public void setNoiDung(String noiDung) {
		NoiDung = noiDung;
	}
	
	
}
