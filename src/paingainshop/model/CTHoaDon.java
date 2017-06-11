package paingainshop.model;



public class CTHoaDon {
	private String MaHD;
	private String MaHH;
	private int SoLuong;
	private int DonGia;
	private int GiamGia;
	public CTHoaDon(String MaHD,String MaHH,int SoLuong,int DonGia,int GiamGia)
	{
		this.MaHD=MaHD;
		this.MaHH=MaHH;
		this.SoLuong=SoLuong;
		this.DonGia=DonGia;
		this.GiamGia=GiamGia;
		
	}
	public String getMaHD() {
		return MaHD;
	}
	public void setMaHD(String maHD) {
		MaHD = maHD;
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
	public int getGiamGia() {
		return GiamGia;
	}
	public void setGiamGia(int giamGia) {
		GiamGia = giamGia;
	}
	
}
