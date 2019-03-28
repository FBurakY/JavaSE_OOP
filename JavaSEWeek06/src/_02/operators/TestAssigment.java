package _02.operators;

public class TestAssigment {

	public static void main(String[] args) {

		int number = 5;

		number *= 3 + 6;

		// number = number * 3 + 6; //yanlis
		// number = number *(3+6); // dogru

		System.out.println(number);

		int x = 20;

		x -= 4;
		// x= x-4;

		System.out.println(x);
	}
}
