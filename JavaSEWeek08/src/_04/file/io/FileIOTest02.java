package _04.file.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest02 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("buffered.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("line1");
		bw.write("\n");
		bw.write("line2");
		bw.write("\n");
		bw.write("line3");
		
		bw.close();
		
		FileReader fr = new FileReader("buffered.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String lineContent = null;
		
		while( (lineContent = br.readLine()) != null) {
			System.out.println(lineContent);
		}
		
		br.close();
	}
}
