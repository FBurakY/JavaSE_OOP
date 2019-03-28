package _02.passByValueVsPassByReference;

public class Test3 {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);
		
		changeNumber(number);
		
		System.out.println(number);
		
		System.out.println();
		int age =20;
		System.out.println(age);
		
		age=changeAge(age);
		System.out.println(age);
	}

	public static void changeNumber(int numberMethod) {
		numberMethod = numberMethod + 20;
		System.out.println(numberMethod);
	}
	
	public static int changeAge(int ageMethod){
		ageMethod++;
		return ageMethod;
	}
	
	
}
