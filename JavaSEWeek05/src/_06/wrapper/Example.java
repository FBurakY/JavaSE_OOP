package _06.wrapper;

public class Example {

	public static void main(String[] args) {
		int primitive=100;
		//otomatik olarak primitive --> wrapper a donusum islemine AUTOBOXING
		
		Integer wrapper = primitive; //AUTOBOXING
		
		//
		
		Integer boxing = new Integer(100); //BOXING
		Integer boxing2 = Integer.valueOf(100); //BOXING
		//
		
		Integer number =  new Integer(100); //boxing
		int primitiveValue = number; //auto-unboxing (wrapperdan --> primitive)
		
		int primitiveValue2 = number.intValue(); // unboxing
		//metot yardimiyla wrapperdan -> primitive donusum yaptigimizda unboxing
		
	}
}
