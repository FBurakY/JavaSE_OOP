package _01.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExample01 {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<String>();
		// public interface List<E> extends Collection<E> {

		// E -> String

		// boolean add(E e);
		// boolean add(String e)

		// E get(int index);
		// String get(int index)

		List<Integer> numberList = new ArrayList<Integer>();
		// E -> Integer
		// boolean add(Integer e)
		// E get(int index);
		// Integer get(int index)

		// List<int> numerlist2 = new ArrayList<int>();
		// bu legal degildir!
		// E -> int olamaz! E -> Integer
		// primitive olamaz.
		// Collectionlarin elemanlari Object tir.

		System.out.println(stringList.isEmpty());

		stringList.add("element1");
		stringList.add("element1");
		stringList.add("element1");
		stringList.add("element2");
		stringList.add("element3");

		System.out.println(stringList.size());
		System.out.println(stringList.get(3)); // index 0 dan baslar!
		// size dogru verilmezse java.lang.IndexOutOfBoundsException hatasi
		// alinir!

		System.out.println(stringList.contains("element2"));
		System.out.println(stringList.contains("element2222"));

		System.out.println(stringList);
		System.out.println(stringList.remove(0));
		System.out.println(stringList.remove("element3"));

		System.out.println(stringList);
		
		stringList.clear();
		
		System.out.println(stringList);
		

	}
}
