package filesIO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromkeyboard {

	public static void main(String[] args) throws IOException {
		
		PrintWriter out = new PrintWriter(new FileWriter("D:\\IO\\EntervalueBykeyboard.txt"));
		
		System.out.println("Enter the value or the message");
		
		InputStreamReader in = new InputStreamReader(System.in);
		
		BufferedReader Br = new BufferedReader(in);
		
		String line = Br.readLine();
		
		while(!line.equals("quit")) {
			
			out.println(line);
			
			line = Br.readLine();
		}
		in.close();
		out.close();
		Br.close();
	}
	
	
}
