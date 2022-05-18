package fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	
	public static void main(String[] args) throws Exception {
		
		try {
			FileReader fr=new FileReader("/home/ctp/Desktop/Prateek_Git/prateek.txt");
			
			int i;
			
			while((i=fr.read())!=-1) {
				System.out.print((char)i);	
			}
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
