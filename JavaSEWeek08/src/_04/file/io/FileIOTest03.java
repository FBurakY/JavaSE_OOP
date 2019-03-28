package _04.file.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileIOTest03 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("printWriter.tx");
		pw.println("line1");
		pw.println("line2");
		pw.println("line3");
		pw.print("test");
		pw.print("test2");
		
		pw.close();
	}
}
