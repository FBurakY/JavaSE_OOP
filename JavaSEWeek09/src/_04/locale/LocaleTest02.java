package _04.locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTest02 {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault()); // en_US
		
		Locale locIT = Locale.ITALY;
		Locale locTR = new Locale("tr","TR");
		Locale locGE = Locale.GERMANY;
		
		DateFormat dateFormatIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		DateFormat dateFormatTR = DateFormat.getDateInstance(DateFormat.FULL, locTR);
		DateFormat dateFormatGE = DateFormat.getDateInstance(DateFormat.FULL, locGE);
		
		Date date = new Date();
		
		System.out.println(dateFormatIT.format(date));
		System.out.println(dateFormatTR.format(date));
		System.out.println(dateFormatGE.format(date));
		
		
	}
}
