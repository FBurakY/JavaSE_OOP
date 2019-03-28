package _05.constructor;

public class Employee {

	private String name;
	private String surname;
	//
	// eger biz bir sinif icin constructor tanimlarsak artik java bizim icin otomatik/default constructori TANIMLAMAZ!!!
	public Employee(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	public Employee() {
		System.out.println("invoked!!!");
	}
	
}
