package _02.overloaded;

public class OverloadedTest2 {

	public static void main(String[] args) {
		OverloadedTest2 object = new OverloadedTest2();
		
		// 10 -> int tipindedir.;
		short s = (short) 32768;
		object.testMethod(s);
		object.testMethod((short)1000);
		
		// 32767
		// 2147483647
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}
	
	public void testMethod(short s) {
		System.out.println(s);
	}
}

// http://www.injavawetrust.com/java-puzzle-25-own-negation/
