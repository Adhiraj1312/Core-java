package filesIO;

import java.io.File;
import java.util.Date;

public class IOfile {

	public static void main(String [] args) {
		
		
		File f = new File("D://IO//Hello.txt");
		
		if(f.exists()) {
			
			System.out.println("File name: " + f.getName());
			System.out.println("File path: " + f.getAbsolutePath());
			
			
			System.out.println("----------------------------------");
			
			System.out.println("Access permision: ");
			System.out.println("Writeable: " + f.canWrite());
			System.out.println("Readable: " + f.canRead());
			
			System.out.println("-----------------------------------");
			
			System.out.println("Check if it is a folder/directory or a file");
			
			System.out.println("is file: " + f.isFile());
			System.out.println("is Folder/directory: " + f.isDirectory());
			
			
			System.out.println("----------------------------------------");
			
			System.out.println("Last modified date of the file");
			
			
			Date lastModifiedDate = new Date(f.lastModified());
			
			
			System.out.println("last Modified Date" + lastModifiedDate);
			
			System.out.println(f.length());
			
			
			
			
		}else {
			
			System.out.println("File not found");
		}
		
		
		
	}
	
	
}
