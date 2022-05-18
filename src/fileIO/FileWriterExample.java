package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("/home/ctp/Desktop/Prateek_Git/prateek.txt");
			
			fw.write("This is the pratice of java FileWriter");
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Success...");

	}

}
