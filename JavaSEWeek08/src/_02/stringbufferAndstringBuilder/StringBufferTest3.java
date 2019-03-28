package _02.stringbufferAndstringBuilder;

public class StringBufferTest3 {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		String str2 = new String("java");
		
		System.out.println(str1.equals(str2));
		
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");
		
		System.out.println(sb1.equals(sb2));
		//StringBuilder ve StringBuffer icin equals metodu override edilmemistir!
		// bu siniflar icin equals == ile ayni sekilde calisir.
	}

}
