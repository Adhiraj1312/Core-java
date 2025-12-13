package filesIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
 
	public static void main(String[] args) throws IOException {
		
		FileWriter f = new FileWriter("D://IO//Hello.txt");
		
		
		f.write("Hello Rays");
		
		System.out.println("Test data written Successfull: ");
		
		f.close();
		
	}
	
}
