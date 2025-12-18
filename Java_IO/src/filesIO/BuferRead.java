package filesIO;

import java.io.*;

public class BuferRead {

 public static void main(String[] args) throws Exception {
	 
		
			BufferedReader file = new BufferedReader(new FileReader("D:\\IO\\AllName.txt"));

			String line = file.readLine();

			while (line != null) {
				System.out.println(line);
				line = file.readLine();
			}

			file.close();

		}

	
	 
 }
	

