package _07.classMembers.declaration.package2;

import _07.classMembers.declaration.package1.Data;

public class SubDataDifferentPackageClass extends Data{

	public void method() {
		
		System.out.println(publicVar);
		System.out.println(protectedVar);
		
		//protected a erisim saglanirken , default a erisim saglanamaz!
		//System.out.println(defaultVar); 
		//kalitim soz konusu oldugunda ,
		// farkli package oldugunda ,
		// kalitim ozelligi kullanilarak protected memberlara erisim saglanabilir.
	}
	
	public void method2(){
		Data data = new Data();
		System.out.println(data.publicVar);
		//
		//legal degildir
//		System.out.println(data.protectedVar);
//		System.out.println(data.defaultVar);
	}
}
