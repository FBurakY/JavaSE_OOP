package _06.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest01 {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("a");
//		Matcher m = p.matcher("java");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
//		Pattern p = Pattern.compile("av");
//		Matcher m = p.matcher("java");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
//		Pattern p = Pattern.compile("a|v"); // a ya da v
//		Matcher m = p.matcher("java");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
//		Pattern p = Pattern.compile("[av]"); // a ya da v
//		Matcher m = p.matcher("java");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
//		Pattern p = Pattern.compile("[a-k]"); // a | b | c .... | k
//		Matcher m = p.matcher("java");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
//		Pattern p = Pattern.compile("ab"); //
//		Matcher m = p.matcher("abababac");
//		while (m.find()) {
//			System.out.println(m.start());
//		}
		
		Pattern p = Pattern.compile("aba"); //
		Matcher m = p.matcher("abababac");
		while (m.find()) {
			System.out.println(m.start());
		}
	}
}

// java.util.regex.Matcher
// java.util.regex.Pattern