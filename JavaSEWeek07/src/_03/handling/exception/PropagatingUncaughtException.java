package _03.handling.exception;

public class PropagatingUncaughtException {

	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
//		try {
//			method2();
//		} catch (Exception e) {
//			System.out.println("catch block!");
//		}
		method2();
	}

	public static void method2() {
		method3();
	}

	public static void method3() {
		int number = 10 / 0;
	}
}

// - method3
// - method2
// - method1
// - main

// ducked exception

// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at
// _03.handling.exception.PropagatingUncaughtException.method3(PropagatingUncaughtException.java:18)
// at
// _03.handling.exception.PropagatingUncaughtException.method2(PropagatingUncaughtException.java:14)
// at
// _03.handling.exception.PropagatingUncaughtException.method1(PropagatingUncaughtException.java:10)
// at
// _03.handling.exception.PropagatingUncaughtException.main(PropagatingUncaughtException.java:6)
