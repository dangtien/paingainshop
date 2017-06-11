package paingainshop.model;

public class NhaCungCap {
	private String MaNCC;
	private String TenNCC;
	private String MaSoThue;
	private String DiaChi;
	private String soDT;
	private String Email;
	private String GhiChu;
	
	public NhaCungCap(String MaNCC,String TenNCC,String MaSoThue,String DiaChi,String soDT, String Email,String GhiChu)
	{
		this.MaNCC=MaNCC;
		this.TenNCC= TenNCC;
		this.MaSoThue = MaSoThue;
		this.DiaChi=DiaChi;
		this.soDT=soDT;
		this.Email=Email;
		this.GhiChu=GhiChu;
	}

	public String getMaNCC() {
		return MaNCC;
	}

	public void setMaNCC(String maNCC) {
		MaNCC = maNCC;
	}

	public String getTenNCC() {
		return TenNCC;
	}

	public void setTenNCC(String tenNCC) {
		TenNCC = tenNCC;
	}

	public String getMaSoThue() {
		return MaSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		MaSoThue = maSoThue;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGhiChu() {
		return GhiChu;
	}

	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	
	
	
}
