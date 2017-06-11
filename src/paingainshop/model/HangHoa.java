package paingainshop.model;



public class HangHoa {
	private String MaHH;
	private String TenHH;
	private String NhomHH;
	private int GiaBan;
	private int GiaNhap;
	private String ThuocTinh;
	private int SoLuong;
	private String DonViTinh;
	private String MaNCC;
	private String GhiChu;
	
	public HangHoa(String MaHH,String TenHH,String NhomHH,int GiaBan,int GiaNhap,String ThuocTinh,int SoLuong,String DonViTinh,String MaNCC,String GhiChu)
	{
		this.MaHH =MaHH;
		this.TenHH= TenHH;
		this.NhomHH =NhomHH;
		this.GiaBan =GiaBan;
		this.GiaNhap= GiaNhap;
		this.ThuocTinh=ThuocTinh;
		this.SoLuong= SoLuong;
		this.DonViTinh=DonViTinh;
		this.MaNCC=MaNCC;
		this.GhiChu= GhiChu;
	}

	public String getMaHH() {
		return MaHH;
	}

	public void setMaHH(String maHH) {
		MaHH = maHH;
	}

	public String getTenHH() {
		return TenHH;
	}

	public void setTenHH(String tenHH) {
		TenHH = tenHH;
	}

	public String getNhomHH() {
		return NhomHH;
	}

	public void setNhomHH(String nhomHH) {
		NhomHH = nhomHH;
	}

	public int getGiaBan() {
		return GiaBan;
	}

	public void setGiaBan(int giaBan) {
		GiaBan = giaBan;
	}

	public int getGiaNhap() {
		return GiaNhap;
	}

	public void setGiaNhap(int giaNhap) {
		GiaNhap = giaNhap;
	}

	public String getThuocTinh() {
		return ThuocTinh;
	}

	public void setThuocTinh(String thuocTinh) {
		ThuocTinh = thuocTinh;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public String getDonViTinh() {
		return DonViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		DonViTinh = donViTinh;
	}

	public String getMaNCC() {
		return MaNCC;
	}

	public void setMaNCC(String maNCC) {
		MaNCC = maNCC;
	}

	public String getGhiChu() {
		return GhiChu;
	}

	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	
}
