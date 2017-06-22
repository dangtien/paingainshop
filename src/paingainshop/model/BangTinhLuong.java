package paingainshop.model;

public class BangTinhLuong {
	private int thang;
	private int nam;
	private String manv;
	private String ten;
	private int gio;
	private int luong;
	private int phucap;
	private int tamung;
	private int phat;
	public BangTinhLuong(int thang, int nam, String manv,String ten, int gio,int luong, int phucap, int tamung, int phat) {
		super();
		this.thang = thang;
		this.nam = nam;
		this.manv = manv;
		this.ten= ten;
		this.gio = gio;
		this.luong=luong;
		this.phucap = phucap;
		this.tamung = tamung;
		this.phat = phat;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getGio() {
		return gio;
	}
	public void setGio(int gio) {
		this.gio = gio;
	}
	
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public int getPhucap() {
		return phucap;
	}
	public void setPhucap(int phucap) {
		this.phucap = phucap;
	}
	public int getTamung() {
		return tamung;
	}
	public void setTamung(int tamung) {
		this.tamung = tamung;
	}
	public int getPhat() {
		return phat;
	}
	public void setPhat(int phat) {
		this.phat = phat;
	}
	
}
