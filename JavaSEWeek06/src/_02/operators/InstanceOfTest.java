package _02.operators;


interface Speedy {
	
}

class Car {
	
}

class Ford extends Car implements Speedy{
	
}

public class InstanceOfTest {

	public static void main(String[] args) {
		Ford ford = new Ford();
		System.out.println(ford instanceof Ford);
		System.out.println(ford instanceof Car); // Ford IS-A Car
		System.out.println(ford instanceof Speedy); // Ford IS-A Speedy
		//
		
		//System.out.println(ford instanceof String); // legal degildir
		// ayni sinif hiyerarsisinde olmalidir.
		
		System.out.println(ford instanceof Runnable);
	}
}
