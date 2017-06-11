package paingainshop.model;

public class KhachHang {
	private String MaKH;
	private String TenHK;
	private String DiaChi;
	private String SoDT;
	private String Email;
	public KhachHang (String MaKH,String TenHK,String DiaChi,String SoDT,String Email)
	{
		this.MaKH = MaKH;
		this.TenHK= TenHK;
		this.DiaChi= DiaChi;
		this.SoDT=SoDT;
		this.Email= Email;	
	}
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		MaKH = maKH;
	}
	public String getTenHK() {
		return TenHK;
	}
	public void setTenHK(String tenHK) {
		TenHK = tenHK;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getSoDT() {
		return SoDT;
	}
	public void setSoDT(String soDT) {
		SoDT = soDT;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}
