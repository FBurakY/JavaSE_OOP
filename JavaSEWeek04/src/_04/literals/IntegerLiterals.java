package _04.literals;

public class IntegerLiterals {

	public static void main(String[] args) {
		
		//decimal ->10luk taban
		int number = 100; // 100 -> integer literali varsayilan olarak int tipindedir.
		//[0,9]
		
		// octal -> 8lik
		// [0,7]
		// sayinin basinda 0 varsa octal ifade eder.
		
		int eight = 010;
		int nine = 011;
		System.out.println(eight);
		System.out.println(nine);
		
		//int compileError = 08; // compiler error
		// 32 bit
		
		// hexadecimal -> 16lik
		// [0, F]
		// A -> 10
		// B -> 11
		// F -> 15
		
		// 0x ya da 0X ile basladiginda bir tam sayi literali -> 16lik 
		
		int hex1 = 0x11;
		System.out.println(hex1);
		int hex2 = 0xA;
		System.out.println(hex2);
		
		// binary literal -> 2lik
		// [0,1]
		
		//0b ya da 0B
		
		int binary = 0B111;
		System.out.println(binary);
		
		int i = 100_000;
	}

}

// tamsayi literallari ;

// decimal
// octal
// hexadecimal
// binary
