package paingainshop.model;



public class NhanVien {
	private String MaNV;
	private String HoTen;
	private int Luong;
	private String Email;
	private String DiaChi;
	private String SoDT;
	private String UserName;
	private String Pass;
	private String GhiChu;
	private String TrangThai;
	
	public NhanVien ( String MaNV, String HoTen, int Luong, String Email, String DiaChi, String SoDT, String UserName, String Pass, String GhiChu,String TrangThai)
	{
		this.MaNV = MaNV;
		this.HoTen=HoTen;
		this.Luong =Luong;
		this.Email = Email;
		this.DiaChi =DiaChi;
		this.SoDT= SoDT;
		this.UserName=UserName;
		this.Pass= Pass;
		this.GhiChu= GhiChu;
		this.TrangThai= TrangThai;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public int getLuong() {
		return Luong;
	}

	public void setLuong(int luong) {
		Luong = luong;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String pass) {
		Pass = pass;
	}

	public String getGhiChu() {
		return GhiChu;
	}

	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}

	public String getTrangThai() {
		return TrangThai;
	}

	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
	
	
}
