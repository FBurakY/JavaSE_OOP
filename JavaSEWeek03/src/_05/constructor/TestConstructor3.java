package _05.constructor;


class Computer {
	private int price;

	public Computer(int price) {
		super();
		this.price = price;
	}
//	
}


class Laptop extends Computer {
	
	//yapilandirici tanimlamadigimizda otomatik olarak no-arg constructor olusur.
	
	Laptop(){
		super(100); //varsayilan olarak super() ifadesi yer alir.
		//bir ust siniftaki default no-arg cosntrucctor i cagirir!
	}
}

public class TestConstructor3 {

}
