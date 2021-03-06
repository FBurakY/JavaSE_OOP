package _01.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample07 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("ibrahim");
		nameList.add("olgun");
		nameList.add("levent");
		//
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}

		System.out.println();

		for (String e : nameList) {
			System.out.println(e);
		}

		System.out.println();
		Iterator<String> iterator = nameList.iterator();

		while (iterator.hasNext()) {
			String e = iterator.next();
			System.out.println(e);
		}
		//

		System.out.println();

		ListIterator<String> listIterator = nameList.listIterator();

		while (listIterator.hasNext()) {
			String e = listIterator.next();
			System.out.println(e);
		}
		
		System.out.println();
		while (listIterator.hasPrevious()) {
			String e = listIterator.previous();
			System.out.println(e);
		}
		

	}
}
