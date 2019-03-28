package _03.file;

import java.io.File;
import java.io.IOException;

public class FIleTest01 {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		// yeni bir java.io.File objesi olusur!
		// bu haliyle , test.txt dosyasi hdd te olusmaz!
		
		System.out.println(file.exists());
		
		boolean isCreated = file.createNewFile();
		
		System.out.println(file.exists());
	}
}
