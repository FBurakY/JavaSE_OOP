package _03.handling.exception;

public class TestException {

	public static void main(String[] args) {

		int number = 10;
		int zero = 0;

		// System.out.println(number / zero);
		// System.out.println("!!!");

		try {
			System.out.println(number / zero);
			System.out.println("bu kisim calismayacak!");
		} catch (ArithmeticException e) {
			System.out.println("catch blogu!!");
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("null pointer exception");
		}

		System.out.println("after try-catch!");
	}
}
