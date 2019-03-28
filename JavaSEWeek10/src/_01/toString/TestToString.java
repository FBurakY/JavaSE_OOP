package _01.toString;

import java.util.Arrays;

public class TestToString {

	public static void main(String[] args) {

		Person person = new Person("levent", "erguder", 28, "Istanbul");
		Person person2 = new Person("emre", "kaya", 22, "Istanbul");

		System.out.println(person);
		// _01.toString.Person@7852e922

		System.out.println(person2);
		// _01.toString.Person@4e25154f

		int[] numbers = { 3, 4, 5 };

		System.out.println(numbers);
		Arrays.stream(numbers).forEach(System.out::println);

	}
}
