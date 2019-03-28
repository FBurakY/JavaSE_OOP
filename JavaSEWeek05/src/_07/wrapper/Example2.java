package _07.wrapper;

public class Example2 {

	public static void main(String[] args) {
		Integer number1 = new Integer(10);
		Integer number2 = new Integer(10);
		
		//new anahtar kelimesiyel olusturdugumuzda (boxing) degerden bagimsiz olarak her zaman farkli obje olusur.
		//farkli 2 objeyi gosterecegi icin == kontrolu false olacaktir.
		System.out.println(number1==number2);
		
		System.out.println(number1.equals(number2));
	}
}
