package _07.tokenizing;

public class TokenTest01 {

	public static void main(String[] args) {
		String content = "test1,test2,test3,test4";

		String[] array = content.split(",");
		
		for(String str : array){
			System.out.println(str);
		}
	}
}

// Token -> simge , sembol..