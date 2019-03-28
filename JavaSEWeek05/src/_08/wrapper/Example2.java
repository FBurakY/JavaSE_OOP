package _08.wrapper;

public class Example2 {

	public static void main(String[] args) {
		Short s = 100;
		
		test(s);
	}
	
	//Short IS-A Integer degildir!
	public static void test(Integer i) {
		System.out.println("Integer");
	}
	
	//Short IS-A Object
	public static void test(Object o) {
		System.out.println("object");
	}

	public static void test(short i) {
		System.out.println("short");
	}
}
