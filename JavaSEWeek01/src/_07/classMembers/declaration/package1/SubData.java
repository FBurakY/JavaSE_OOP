package _07.classMembers.declaration.package1;

public class SubData extends Data{

	void test () {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		
		//System.out.println(privateVar); //legal degildir!
		// private memberlar class a ozgudur, sub class da olsa erisim saglanamaz. (gorunur degildir/visible)
	}
}
