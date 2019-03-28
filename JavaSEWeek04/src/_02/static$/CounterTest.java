package _02.static$;

public class CounterTest {

	public static void main(String[] args) {
		System.out.println(Counter.number);
		Counter.number= 20; // static degiskenlere direkt sinifIsmi. seklinde erisim saglariz.
		System.out.println(Counter.number);
		//
		
		Counter  object = new Counter();
		
		//The static field Counter.number should be accessed in a static way
		System.out.println(object.number);
	}
}
