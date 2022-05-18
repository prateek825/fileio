package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	
	public static void main(String[] args) {
		
		try {
//			FileOutputStream fos=new FileOutputStream("/home/ctp/Desktop/Prateek_Git/prateek.txt");
//			fos.write(65);
//			String s = "Hello, I am Prateek";
//			byte b[]=s.getBytes();
//			fos.write(b);
//			fos.close();
			
//			System.out.println("sucess...");
			
			FileInputStream fis = new FileInputStream("/home/ctp/Desktop/Prateek_Git/prateek.txt");
			
			int i = 0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
//			System.out.print((char)i);
			
			fis.close(); 
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
