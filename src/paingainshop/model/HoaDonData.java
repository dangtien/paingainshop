package paingainshop.model;
import java.util.ArrayList;
import java.util.Date;
public class HoaDonData extends HoaDon{
    private  ArrayList<HangHoa> items;

    public HoaDonData(String maHD, Date ngay, String maKH, String maNV) {
        super(maHD, ngay, maKH, maNV);
        items = new ArrayList<>();
    }
    public void addItem(HangHoa item){
        int index = isDuplicate(item);
        if(index !=-1){
            HangHoa tmp = items.get(index);
            items.get(index).setSoLuong(tmp.getSoLuong() + item.getSoLuong());
        }else{
            items.add(item);
        }
    }
    public int isDuplicate(HangHoa sp){
        for(int i=0; i<items.size();i++){
			if(items.get(i).equals(sp)){
				return i;
			}
		}
	return -1;
    }
    public void remove(HangHoa item){
        if(this.items !=null){
            items.remove(item);
        }
    }
    public void update(HangHoa item){
        int index = isDuplicate(item);
        if(index != -1){
            items.get(index).setSoLuong(item.getSoLuong());
        }
    }
}