package _01.flow.control;

public class Notes {

	//
	// kodumuzda eger cok fazla if-else blogu varsa bir seyleri yanlis yapiyor
	// olabiliriz.
	// (tekrar dusun!) , daha iyi yazabilir miyim?

	// if-else blogunu fazla sayida kullanmamiz gerekiyorsa , bu durumda switch
	// case yapisini tercih edebiliriz.

	// if(booleanExpession) { }
	// olabildigince basit olmalidir.
	//

	// boolean degiskenler icin == kontrolu kullanmak riskli olabilir. KULLANMA!
	
	public static void main(String[] args) {

		boolean nameCheck = "test".equals(getName());
		boolean ageCheck = getAge() > 15;

		//if blogunu bu sekilde yapmak daha kolay pratik olacaktir.
		if (nameCheck && ageCheck) {

		}
		
		boolean test = false;
		
		if(test = true){
			//BUG , == yerine = koyduk yanlislikla!
		}
		
		if(test) {
			//DOGRU yaklasim.
		}

	}

	public static String getName() {
		return "test";
	}

	public static int getAge() {
		return 20;
	}

	public static String gender() {
		return "male;";
	}
}
