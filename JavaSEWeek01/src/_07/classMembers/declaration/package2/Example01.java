package _07.classMembers.declaration.package2;

import _07.classMembers.declaration.package1.Data;

public class Example01 {

	public static void main(String[] args) {
		Data dataObject = new Data();
		
		System.out.println(dataObject.publicVar); //
		dataObject.publicMethod();
		//farkli paketten sadece public degiskenlere ya da public metotlara erisim saglanabilir.
		
//		System.out.println(dataObject.defaultVar);
//		System.out.println(dataObject.protectedVar);
//		System.out.println(dataObject.privateVar);
		
	}
}
