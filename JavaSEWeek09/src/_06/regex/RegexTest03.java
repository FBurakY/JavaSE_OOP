package _06.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest03 {

	public static void main(String[] args) {
		
//		Pattern p = Pattern.compile("\\d");
//		Matcher m = p.matcher("java88 56test 394best");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
//		Pattern p = Pattern.compile("\\d+");  // + --> 1 ya da daha fazla
//		Matcher m = p.matcher("java88 56test 394best");
//		while (m.find()) {
//			System.out.println(m.start() + " : " + m.group());
//		}
		
//		Pattern p = Pattern.compile("\\d?");  // ? --> 0 ya da 1
//		Matcher m = p.matcher("java88 56test 394best");
//		while (m.find()) {
//			System.out.println(m.start() + " : " + m.group());
//		}
		
//		Pattern p = Pattern.compile("\\d*");  // * --> 0 ya da da fazla
//		Matcher m = p.matcher("java88 56test 394best");
//		while (m.find()) {
//			System.out.println(m.start() + " : " + m.group());
//		}
		
		
//		Pattern p = Pattern.compile("\\d{2}");  // 2 tane digit olsun.
//		Matcher m = p.matcher("java88 56test 394best");
//		while (m.find()) {
//			System.out.println(m.start() + " : " + m.group());
//		}
		
		Pattern p = Pattern.compile("\\d{2,3}");  // 2 ya da 3 anlamina gelir.
		Matcher m = p.matcher("ja1va88 56test 394best");
		while (m.find()) {
			System.out.println(m.start() + " : " + m.group());
		}
		
		//Quantifier
		// * -> {0,} 0 ya da daha fazla
		// + -> {1,} 1 yada daha fazla
		// ? -> {0,1} 0 ya da 
		// {X}
		// {X,Y}
	}
}
