package _08.classMembers.nonaccess.modifiers;

class Animal {
	public void eat() {
		System.out.println("Animal # eat");
	}

	public final void run() {
		System.out.println("Animal # run");
	}
}

class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog # eat");
	}
	
	//@Override
	//legal degildir! final metotlar OVERRIDE edilemezler! derleme hatasi verir.
//	public void run() {
//		System.out.println("Animal # run");
//	}
}

public class Example01 {

}
