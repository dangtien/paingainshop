package paingainshop.model.DAO;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class test {

	public static void main(String[] args) {
		//GregorianCalendar gcalendar = new GregorianCalendar();
		//System.out.print("Time: ");
	      //System.out.print(gcalendar.get(Calendar.HOUR) + ":");
	      //System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
	      //System.out.println(gcalendar.get(Calendar.SECOND));
		Date date = new Date();
		SimpleDateFormat datefrmat = new SimpleDateFormat("yyyy-MM-dd");
        String Ngay = datefrmat.format(date);
		SimpleDateFormat timefrmat = new SimpleDateFormat("HH:mm");
        String Gio = timefrmat.format(date);
        System.out.println(Gio);
        System.out.println(Ngay);
	}

}
