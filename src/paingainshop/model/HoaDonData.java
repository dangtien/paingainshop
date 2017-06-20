package paingainshop.model;
import java.util.ArrayList;
public class HoaDonData extends HoaDon{
    private  ArrayList<CTHoaDon> items;
    private int saletotal;
    public HoaDonData(String maHD, String ngay, String maKH, String maNV) {
        super(maHD, ngay, maKH, maNV);
        items = new ArrayList<>();
        this.saletotal =0;
    }
    public void setSaleTotal(int sale){
        this.saletotal = sale;
    }
    public ArrayList<CTHoaDon> getItems(){
        return items;
    }
    public void updateSale(){
        for(CTHoaDon item:items){
            if(item.getGiamGia()==0 || item.getSaltong()){
                item.setGiamGia(this.saletotal);
            }
        }
    }
    public void addItem(CTHoaDon item){
        int index = isDuplicate(item);
        if(item.getGiamGia()==0){
            item.setGiamGia(this.saletotal);
        }
        if(index !=-1){
            CTHoaDon tmp = items.get(index);
            items.get(index).setSoLuong(tmp.getSoLuong() + item.getSoLuong());
        }else{
            items.add(item);
        }
    }
    public int isDuplicate(CTHoaDon sp){
        for(int i=0; i<items.size();i++){
			if(items.get(i).equals(sp)){
				return i;
			}
		}
	return -1;
    }
    public void remove(CTHoaDon item){
        if(this.items !=null){
            items.remove(item);
        }
    }
    public void update(CTHoaDon item){
        int index = isDuplicate(item);
        if(item.getGiamGia()==0 && item.getSaltong()){
            item.setGiamGia(this.saletotal);
        }
        if(index != -1){
            items.get(index).setSoLuong(item.getSoLuong());
            items.get(index).setDonGia(item.getDonGia());
            items.get(index).setGiamGia(item.getGiamGia());
        }
    }
    public CTHoaDon getItem(String mahh){
        for(int i=0; i<items.size();i++){
			if(items.get(i).getMaHH().equals(mahh)){
				return items.get(i);
			}
		}
        return null;
    }
}