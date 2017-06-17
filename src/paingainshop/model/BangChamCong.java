package paingainshop.model;
import java.sql.Time;
public class BangChamCong {
	private int MaCC;
	private String Ngay;
	private Time GioBD;
	private Time GioKT;
	private int TienPhat;
	private int Phucap;
	private int Tamung;
	private int MaCa;
	private String MaNV;
	
	public BangChamCong(int MaCC, String Ngay, Time GioBD, Time GioKT, int TienPhat, int Phucap, int Tamung, int MaCa, String MaNV){
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
	
	public int getMaCC(){
		return this.MaCC;
	}
	public void setMaCC(int MaCC){
		this.MaCC = MaCC;
	}
	public String getNgay(){
		return this.Ngay;
	}
	public void setNgay(String Ngay){
		this.Ngay = Ngay;
	}
	public Time getGioBD(){
		return this.GioBD;
	}
	public void setGioBD(Time GioBD){
		this.GioBD = GioBD;
	}
	public Time getGioKT(){
		return this.GioKT;
	}
	public void setGioKT(Time GioKT){
		this.GioKT = GioKT;
	}
	public int getTienPhat(){
		return this.TienPhat;
	}
	public void setTienPhat(int TienPhat){
		this.TienPhat = TienPhat;
	}
	public int getPhucap(){
		return this.Phucap;
	}
	public void setPhucap(int Phucap){
		this.Phucap = Phucap;
	}
	public int getTamung(){
		return this.Tamung;
	}
	public void setTamung(int Tamung){
		this.Tamung = Tamung;
	}
	public int getMaCa(){
		return this.MaCa;
	}
	public void setMaca(int Maca){
		this.MaCa = Maca;
	}
	public String getMaNV(){
		return this.MaNV;
	}
	public void setMaNV(String MaNV){
		this.MaNV = MaNV;
	}
}
