package fileIO;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) {
		
		try {
			File file=new File("javaFile123.txt");
			
			if(file.createNewFile()) {
				System.out.println("New File is created");
			}else {
				System.out.println("File already exists.");
			}
			
			String path = file.getAbsolutePath();
			
			System.out.println(path);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
