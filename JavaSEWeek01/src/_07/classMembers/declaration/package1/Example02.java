package _07.classMembers.declaration.package1;

public class Example02 {

	public static void main(String[] args) {
		Data dataObject = new Data();
		
		System.out.println(dataObject.publicVar); //
		dataObject.publicMethod();
		//farkli paketten sadece public degiskenlere ya da public metotlara erisim saglanabilir.
		
		//ayni package oldugunda default ve protected levele erisim saglanir!
		System.out.println(dataObject.defaultVar);
		System.out.println(dataObject.protectedVar);

		//System.out.println(dataObject.privateVar); // erisim saglanamaz!!
		//private memberlara ayni paket de olsa erisim saglanamaz!!!
	}
}
