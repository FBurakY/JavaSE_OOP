package _04.file.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest05 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("bufferedStream.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write("mycontent".getBytes());
		bos.close();

		FileInputStream fis = new FileInputStream("bufferedStream.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		while(bis.available()>0){
			int unicode = bis.read();
			System.out.println(unicode + ":" + (char) unicode);
		}
		
		bis.close();
		
	}
}

