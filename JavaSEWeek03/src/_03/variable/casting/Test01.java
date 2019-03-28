package _03.variable.casting;

class Animal {
	public void eat(){
		System.out.println("Animal eat");
	}
}

class Dog extends Animal {
	
	public void eat(){
		System.out.println("Dog eat");
	}
	
	public void bark(){
		System.out.println("barking...");
	}
}

class Cat extends Animal {
	
	public void meow(){
		System.out.println("meow...");
	}
}

public class Test01 {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Dog dog = (Dog) animal; 
		//java.lang.ClassCastException
		//downcasting
		//kalitim hiyerarsisinde ust siniftan -> alt sinifa (super-sub) casting -> downcasting
		
		// Dog tipindeki bir degisken Animal tipindeki bir objeyi gosteremez.
		// Animal IS-A Dog DEGILDIR!!
		
		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		
		if(animal instanceof Dog) {
			Dog dog2 = (Dog)animal;
			System.out.println("it is dog!");
		}else  if (animal instanceof Cat) {
			//
			Cat cat1 = (Cat)animal;
		}
		
		//String compileError = (String)animal; 
		
		Dog dogObject = new Dog();
		Animal animalObject = dogObject; //upcasting
		//burada ClassCastException riski yoktur.
		//implicit/kapali sekilde yapilabilir.
		
		Animal animalObject2 = (Animal)dogObject; 
		//acik sekilde belirtebiliriz. fakat tercih edilmez.
		
		
		Animal[] animalArray = { new Dog(), new Animal(), new Cat()};
		
		for(Animal a : animalArray){
			if( a instanceof Dog){
				((Dog) a).bark();
			}else if( a instanceof Cat) {
				((Cat) a).meow();
			}
		}
	}
}
