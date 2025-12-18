package filesIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ValidMobileNumber {

	public static void main(String [] args) throws IOException {
		
		FileReader source = new FileReader("D:\\IO\\MobileNumber.txt");
		
		FileWriter target = new FileWriter("D:\\IO\\ValiNumber.txt");
		
		BufferedReader r = new BufferedReader(source);
		
		BufferedWriter w = new BufferedWriter(target);
		
		
		String mobilenumber = r.readLine();
		
		String e = "^[6-9]\\d{9}$";
		
		while(mobilenumber != null) {
			
			if(mobilenumber.matches(e)) {
			System.out.println(mobilenumber);
			w.write(mobilenumber);
			w.newLine();
		}
		mobilenumber = r.readLine();
		
		}	
		w.close();
		r.close();
	}
	
}

	