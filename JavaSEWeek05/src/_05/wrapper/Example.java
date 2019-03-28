package _05.wrapper;

public class Example {

	public static void main(String[] args) {
		Boolean bool1 = new Boolean(false);
		
		Boolean bool2= new Boolean("levent");
		//true/tRue/TRUE ...  haric false olur
		System.out.println(bool2);
		
		Boolean bool3= new Boolean("tRuE");
		System.out.println(bool3);
		
		Integer i = new Integer(10);
		//Integer i2 = new Integer("levent"); //java.lang.NumberFormatException
		//System.out.println(i2);
		
		Integer i3 = new Integer("100");
		System.out.println(i3);
		
		Float f = new Float(10.5);
		Float f2 = new Float(10.2F);
		
		Byte b1 = new Byte((byte) 10);
	}
}
