package _01.override;

class Animal {

	int height = 100;

	public void eat() {
		System.out.println("animal#eat");
	}
	
	public static void run(){
		System.out.println("animal#run");
	}
}

class Dog extends Animal {
	
	//instance degiskenler icin OVERRIDE soz konusu degildir.
	int height = 200;

	@Override
	public void eat() {
		System.out.println("Dog#eat");
	}
	
	//@Override //static methodlar icin OVERRIDE SOZ KONUSU DEGILDIR!!!
	// redefined
	// override methodlar icin tanimli kisitlamlar burada da gecerlidir.
	public static void run(){
		System.out.println("Dog#run");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		
		Animal animalDog = new Dog();
		animalDog.eat();
		
		//
		System.out.println(animalDog.height);
		
		animalDog.run();
		
	}
	
}
