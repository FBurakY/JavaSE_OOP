package _03.hashCode;

public class TestHashCode {

	public static void main(String[] args) {
		Customer customer = new Customer("emre", "kaya", 22, "Istanbul");

		System.out.println(customer.hashCode()); // 743859000
	}
}

// x.equals(y) == true ise x.hashCode() == y.hashCode() true OLMAK zorundadir.
// x.hashCode() == y.hashCode() ise  x.equals(y) == true OLMAK ZORUNDA DEGILDIR!

//x.hashCode() !=y.hashCode() ise x.equals(y) == false olmalidir!
