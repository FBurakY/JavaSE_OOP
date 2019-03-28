package _08.inheritance;

public class Notes {

}


// kalitimin(inheritance) 2 temel amaci vardir ;

// 1) kod tekrarini onlemek (duplication)
// 2) polymorphism saglamak(dynamic)



abstract class Animal {
	public void walk() {
		System.out.println("walking....");
		//
		//
	}
	
	// public abstract void eat();
	public void eat () {
		//no operation
	}
}


class Dog extends Animal{
	public void bark() {
		System.out.println("sound....");
		//
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}

class Cat extends Animal {
	public void mew() {
		System.out.println("mew....");
		//
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}

class Bird extends Animal {
	
	@Override
	public void walk() {
		///
		//
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	
}


