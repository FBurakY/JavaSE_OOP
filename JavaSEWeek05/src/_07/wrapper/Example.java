package _07.wrapper;

public class Example {

	public static void main(String[] args) {
		Integer number1 = 100;
		Integer number2 = 100;

		System.out.println(number1 == number2);

		Integer number3 = 1000;
		Integer number4 = 1000;
		
		//-Djava.lang.Integer.IntegerCache.high="1000"
		
		System.out.println(number3 == number4);
		
		//WRAPPER ve STRING icin == yerine equals kullan!
	}
}
