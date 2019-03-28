package _01.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample02 {

	public static void main(String[] args) {

		List list = new ArrayList();
		// E -> Object

		list.add("1000");
		list.add(10000);
		list.add(true);

		// String element = (String) list.get(1);
		// java.lang.ClassCastException: java.lang.Integer cannot be cast to
		// java.lang.String

		List<String> stringList = new ArrayList<>();
		stringList.add("1000");
		//stringList.add(10000); //compiler error!
	}
}
