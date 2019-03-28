package _03.dateFormat;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {
		Date date = new Date();
		//
		System.out.println(date);
		
		//
		DateFormat df1 = DateFormat.getInstance();	
		System.out.println(df1.format(date));
		
		df1 = DateFormat.getDateInstance(DateFormat.MEDIUM);		
		System.out.println(df1.format(date));
		
		df1 = DateFormat.getDateInstance(DateFormat.LONG);		
		System.out.println(df1.format(date));
		
		
		df1 = DateFormat.getDateInstance(DateFormat.FULL);		
		System.out.println(df1.format(date));
	}
}
