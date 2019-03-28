package _04.returnTypes;

public class Notes {

	public String getName(){
		return null;
	}
	
	public Integer getAge(){
		return null;
	}

	//legal degildir!
//	public int getNumber(){
//		return null;
//	}
	
	
	public static int giveInt(){
		char ch1 = 'x';
		
		return ch1;
	}
	
	public static double giveDouble(){
		return 1000;
	}
	
	// cast yapmamiz gereklidir!
	public static int giveInt2(){
		return (int) 1000.524;
	}
	
	public void downloadFile(String name, String password){
		
		//
		//
//		if(notAuthenticated){
//			return ;
//		}
		//
		//
		//
		//
		
		
		
		//return 100;// compile error;
	}
	
	public static void main(String[] args) {
		// char -> 16 bit unsigned 
		// int -> 32 bit signed
		//char c1 = -10; negatif deger alamaz.
		
		char c2 =  65;
		char c3 ='A';
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(giveInt());
		System.out.println(giveInt2()); 
		
		
		int n1 = 10;
		int n2 = 4;
		//DIKKAT!
		System.out.println(n1/n2);
		System.out.println((double)n1/n2);
	}
	
}

//

// reference type donus tipine sahip bir metot icin null deger donulebilir.
// primitive type icin bu durum soz konusu DEGILDIR!