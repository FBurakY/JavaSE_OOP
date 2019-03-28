package _05.numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {

	public static void main(String[] args) {

		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		System.out.println(nf1.format(3456.458));
		
		NumberFormat nf2  = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println(nf2.format(3456.458));
		
		NumberFormat nf3  = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(nf3.format(3456.458));
		
		NumberFormat nf4  = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf4.format(3456.458));
	}
}
