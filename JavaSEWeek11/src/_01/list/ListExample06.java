package _01.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample06 {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();
		nameList.add("ibrahim");
		nameList.add("olgun");
		nameList.add("levent");
		//

		Object[] array1 = nameList.toArray();

		String[] stringArray1 = nameList.toArray(new String[nameList.size()]);
		//

		nameList.add("new element!");
		
		System.out.println(nameList);
		
		for(String e : stringArray1) {
			System.out.println(e);
		}

	}
}
