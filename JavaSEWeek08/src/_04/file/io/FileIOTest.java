package _04.file.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) throws IOException {

		//FileWriter fileWriter = new FileWriter("fw.text", true);
		FileWriter fileWriter = new FileWriter("fw.text");
		fileWriter.write("test");
		fileWriter.write(" test2");
		fileWriter.write(" test3");
		
		//
		fileWriter.close();

		//
		
		FileReader fileReader = new FileReader("fw.text");
		
		char [] charArray = new char[20];
		fileReader.read(charArray);
		
		for(char c : charArray){
			System.out.println(c);
		}
		
		fileReader.close();
	}
}

// Writer - Reader
// Stream
