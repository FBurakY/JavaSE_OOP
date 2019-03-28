package _02.overloaded;

class Calculator {

	//Overloaded methods CAN change the access modifier.
	private void calculate(int a, int b) {
		System.out.println("int int ");
	}

	//Overloaded methods CAN change the return type.
	public double calculate(double a, double b) {
		System.out.println("double double ");
		return a+b; 
	}
	
//	public void calculate(int a, double b) {
//		System.out.println("int double ");
//	}
	
	public void testFloat(float f) {
		
	}
}

public class OverloadedTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.calculate(10, 20);
		calc.calculate(10.0, 20.0);
		calc.calculate(10, 20.0);
		
		//calc.testFloat(20.0);// derleme hatasi verir
		calc.testFloat(20.0f);
	}
}

// 10 -> Javada tamsayilarin tipi int dir.
// 20.0 -> javada noktali sayilarin/kusuratli/floating point tipi varsayilan olarak double
// 20.0f -> float tipinde olacaktir.