package _05.constructor;



//abstract classlar da consructor a sahiptir!!!
abstract class Animal {
	Animal() {
		super();
		System.out.println("Animal constructor");
	}

	Animal (int a){
		
	}
}

class Dog extends Animal {
	Dog() {
		super();//her yapilandiricida default olarak super() ifadesi vardir.
		System.out.println("dog constructor");
	}
}

class Kangal extends Dog {
	Kangal() {
		super();
		System.out.println("kangal constructor");
	}
}

public class TestContructor2 {

	public static void main(String[] args) {
		Dog dog = new Kangal();
		//Dog objesi olusturuyoruz!!!
		//objemizin tipi Kangal
		// constructor chaining -> en ust super class a ait contructor calisir sirayisla asagiya dogru inmeye baslar!
	}
}
