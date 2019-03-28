package _09.polymorphism;


class Animal {
	
}

class Dog extends Animal {
	
}

public class Test {

	public static void main(String[] args) {
		//
		Dog dog = new Dog();
		Animal animal = new Animal();
		//
		Animal animalDog = new Dog(); // Dog IS-A Animal DOGRUDUR!
		// reference type variable
		// local variable
		// degiskenin tipi Animal
		// objenin tipi Dog
		
		// javada bir reference tpye degisken , kendi tipinde ya da subclass tipindeki bir objeyi gosterebilir (refer)
		// super classi tipindeki bir objeyi GOSTEREMEZ!!! (IS-A uymasi gereklidir)!!!!!
		
		Object object = animalDog; // java.lang.Object sinifi , sinif hiyerarsisinin tepesinde yer alir!!!!
		
		// butun siniflar icin IS-A java.lang.Object DOGRUDUR!
		
		//Dog dogAnimal = new Animal(); // Animal IS-A Dog DEGILDIR!
		//Degisken tipi Dog
		//objenin tipi Animal 
		// LEGAL DEGILDIR!
		
	}
}
