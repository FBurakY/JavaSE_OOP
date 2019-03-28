package _03.handling.exception;

public class FinallyTest {

	public static void main(String[] args) {
		
		try {
			System.out.println("test try");
		}finally {
			System.out.println("finally works!");
		}
		
		//
		
		try {
			throw new NullPointerException();
		}finally {
			System.out.println("finally 2");
			//finally blogu , hata olsun ya da olmasin calisacaktir!
			//
		}
	}
}
