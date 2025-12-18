package serilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternilizFile {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		
		Employe e = new Employe(1 , "Rahul");
		
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\IO\\Employe.xls"));
		
		
		out.writeObject(e);
		
		out.close();
		
		
		System.out.println("Object Serialization Successfull...");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\IO\\Employe.xls"));
		
		
		System.out.println(in.readObject());
		
		in.close();
		
	}
	
}
