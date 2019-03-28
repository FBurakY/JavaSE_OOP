package _01.date;

import java.util.Date;

public class Notes {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// Mon Dec 18 21:10:25 EET 2017

		System.out.println(date.getTime());
		// 1513620650971 surekli artar.
		// Returns the number of milliseconds since January 1, 1970, 00:00:00
		// GMT represented by this
		
		System.out.println(System.currentTimeMillis());

	}
}

// java.util.Date
// java.util.Calendar