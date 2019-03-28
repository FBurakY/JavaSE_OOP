package _02.operators;

public class LogicatlOperator {

	public static void main(String[] args) {
		
		int i = 5;
		
		if(i<10 || i/0>1) {
			System.out.println("true");
		}
		
		
		if(i>10 && i/0>1) {
			System.out.println("true");
		}
		
		
	}
}
