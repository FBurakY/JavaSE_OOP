package _02.equals;

public class TestEquals {

	public static void main(String[] args) {
		//
		Employee employee = new Employee("emre", "kaya", 22, "Istanbul");
		Employee employee2 = new Employee("emre", "kaya", 22, "Istanbul");
		//
		System.out.println(employee == employee2);
		System.out.println(employee.equals(employee2));
		
	}
}

// java.lang.Object sinifinda yer alan equals metodu aslinda == ile ayni sekilde calisir.
/*
 *     public boolean equals(Object obj) {
        return (this == obj);
       }
 */


//equals metodunun contractlari.

// reflexive (yansimali)
// x.equals(x) -> true olmalidir.

// symmetric/simetrik

// x.equals(y) true ise
// y.equals(x) true olmalidir.

// transitive/gecisli
// x.equals(y) true ise
// y.equals(z) true ise
// x.equals(z) true olmalidir.

// consistent/tutarli
// x.equals(y) true ise her zaman zaman true olmalidir.

// null reference
// x.equals(null) true olmalidir.


