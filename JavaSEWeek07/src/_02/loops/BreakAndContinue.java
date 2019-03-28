package _02.loops;

public class BreakAndContinue {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {
				continue;
			}

			if (i == 7) {
				break;
			}

			System.out.println("i : " + i);
		}
		//

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("hello");
				break;
			}
		}
		
		System.out.println("labeled break");
		
		mylabel : for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("once!");
				break mylabel;
			}
		}

	}
}
