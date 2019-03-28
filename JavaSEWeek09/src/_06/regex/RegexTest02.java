package _06.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest02 {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\d"); // \d ->digit [0-9]
//		Matcher m = p.matcher("java8 5test");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
//		Pattern p = Pattern.compile("\\D"); // non-digit anlamina gelir.
//		Matcher m = p.matcher("java8 5test");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
//		Pattern p = Pattern.compile("\\s"); // white-space
//		Matcher m = p.matcher("java8 5test 3best");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
//		Pattern p = Pattern.compile("\\S"); //  non white-space
//		Matcher m = p.matcher("java8 5test 3best");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
//		Pattern p = Pattern.compile("\\w"); //  harf rakam alt cizgi
//		Matcher m = p.matcher("java8 5test 3best");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
		Pattern p = Pattern.compile("a.c"); //  . karakteri herhangi bir karakter buraya gelebilir.
		Matcher m = p.matcher("ac abc a c a  ");
		while (m.find()) {
			System.out.println(m.start());
		}
	}
}
