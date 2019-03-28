package _05.nonaccess.modifiers;

public class Notes {

}

// final
// abstract

// bir sinif final tanimlanirsa bu sinifi kalitamayiz (extends)
// public final class Integer 
// public final class String


final class Animal {
	
}

// Animal sinifi final oldugu icin kalitim yapilamaz.
//class Dog extends Animal{
//	
//}

// abstract/soyut , final keywordleri birbirine zittir.
// bir sinifi abstract sinif olarak tanimliyorsak (icerisinde abstract metotlar olmasini bekleriz) ve amaci katilmaktir.
// final siniflar ise katilmaya engel olur.

// abstract x final

// abstract siniflardan obje olusmaz!

abstract class Car {
	abstract void getEngine();	
}

class Ford extends Car {

	@Override
	void getEngine() {
	
	}
	
}


