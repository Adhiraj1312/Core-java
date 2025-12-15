package filesIO;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWritter {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter file = new BufferedWriter(new FileWriter("D:\\IO\\Hello.txt"));
		
		
		file.write("Hello ");
		file.newLine();
		file.write("i am adhiraj");
		file.newLine();
		file.write("iam a developer");
		
		System.out.println("file upload successfull");
		
		file.close();
	}
	
	
}
