package _03.handling.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionMatching {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("myfile.txt");
			fr.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			//IOException IS-A Exception
		}
		
//		try {
//			FileReader fr = new FileReader("myfile.txt");
//			fr.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
// compiler error
//		}
		
		// FileNotFoundException IS-A IOException
		// subclass daha onceki catch blogunda olmasi gereklidir.
	}
}

//public FileReader(String fileName) throws FileNotFoundException {
//    super(new FileInputStream(fileName));
//}


// public class FileNotFoundException extends IOException 