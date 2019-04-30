package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date date = new Date(119, 11, 24);
		System.out.println(date);

		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, 00, 31, 0, 0, 0);
		calendar.set(Calendar.YEAR, 2019);
		Date maDate = calendar.getTime();

		SimpleDateFormat formatteur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.sss");

		System.out.println(formatteur.format(maDate));
	}

}
