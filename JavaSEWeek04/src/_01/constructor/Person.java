package _01.constructor;

public class Person {

	private String name;
	private String surname;
	private int age;
	
	// yapilandirici tanimlamaktaki amac;
	// konfigurasyon olabilir , 
	// instance degiskenlere ilk deger atamasi(initialize) olabilir.
	
	
	
	public Person(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	private Person() {
		//System.out.println("compiler error");
		this("guest", "guest", 18);
		//super(); // this varsa super kullanilamaz!
		
		// bir yapilandirici hem super hem de this(..) yapisina sahip olamaz!
		// this (..) yapisi da super gibi ilk calisan ifade olmalidir.
		
		// private olmasina ornekler
		// singleton design pattern
		// utility classlari -> java.lang.Math
		// builder pattern
		
	}
	
	//BU YAPILANDIRICI DEGILDIR METOTTUR!
	// This method has a constructor name
	public void Person(int age){
		
	}
	
	public Person(int age){
		
	}
}
//yapilandiriclarin donus tipi olamaz