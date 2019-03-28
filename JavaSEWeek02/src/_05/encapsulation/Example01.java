package _05.encapsulation;

public class Example01 {

	public static void main(String[] args) {
		BadEncapsulation bad = new BadEncapsulation();
		int externalNumber = -10;
		
		bad.number =externalNumber;
		if(externalNumber <0) {
			bad.number = 0;
		}
		
		GoodEncapsulation good = new GoodEncapsulation();
		
		good.setNumber(10);//
	
	}
}
