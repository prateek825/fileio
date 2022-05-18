package fileIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	
	public static void main(String[] args) {
		
		try {
			Reader reader = new FileReader("/home/ctp/Desktop/Prateek_Git/prateek.txt");
			int data = reader.read();
			
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
