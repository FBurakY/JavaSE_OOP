package _05.numberFormat;

import java.text.NumberFormat;

public class NumberFormatTest03 {

	public static void main(String[] args) {
		NumberFormat nf1 = NumberFormat.getInstance();
		
		nf1.setMaximumFractionDigits(5); //virgulden sonraki hassasiyet degerini aritrabiliriz.
		// defaults 3 tur.
		System.out.println(nf1.format(3456.454563));
		
		
		nf1.setMinimumFractionDigits(2);
		
		
		System.out.println(nf1.format(10)); //10.00 , setMinimumFractionDigits 2 oldugu icin 0 kendisi koyar.
		System.out.println(nf1.format(10.12));
		System.out.println(nf1.format(10.3)); //10.30
		
	}
}
