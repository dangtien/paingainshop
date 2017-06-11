package paingainshop.model;



public class CTDonDatHang {
	private String MaDDH;
	private String MaHH;
	private int SoLuong;
	private int DonGia;
	
	public CTDonDatHang(String MaDDH,String MaHH,int SoLuong,int DonGia)
	{
		this.MaDDH=MaDDH;
		this.MaHH=MaHH;
		this.SoLuong=SoLuong;
		this.DonGia=DonGia;
		
	}

	public String getMaDDH() {
		return MaDDH;
	}

	public void setMaDDH(String maDDH) {
		MaDDH = maDDH;
	}

	public String getMaHH() {
		return MaHH;
	}

	public void setMaHH(String maHH) {
		MaHH = maHH;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public int getDonGia() {
		return DonGia;
	}

	public void setDonGia(int donGia) {
		DonGia = donGia;
	}
	
}
