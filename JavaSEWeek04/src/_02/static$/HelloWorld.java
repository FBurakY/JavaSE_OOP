package _02.static$;

public class HelloWorld {

	private String message= "hello world!"; // bu degisken instance degiskendir!
	//static degilse ve metot icrisinde degilse instance degiskendir!
	// instance degiskenler --> objeye aittir.
	public static void main(String[] args) {
		//Cannot make a static reference to the non-static field message
		//static methodlardan non-static degiskenlere (instance variable) ya da instance methodlara direkt erisim SAGLANAMAZ!
		//System.out.println(message);
		
		HelloWorld object1 = new HelloWorld();
		
		System.out.println(object1.message);
	}
}
