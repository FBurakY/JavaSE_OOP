package _02.static$;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("levent", "erguder", 28);
		//objeler heap alaninda yasarlar!
		// instace degiskenler de obje ile birlikte heap te yasarlar.
		//local variable
		//reference type
		
		Person person2 = new Person("ibrahim", "kuyucu", 25);
//
		//instance degiskenlerin varligi objeye baglidir.
//		System.out.println(name);
//		System.out.println(Person.name);
	}
}
