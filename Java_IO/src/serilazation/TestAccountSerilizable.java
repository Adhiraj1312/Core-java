package serilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerilizable {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {

		Account a = new Account("874789790238", 7928.00);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\IO\\Account.txt"));

		out.writeObject(a);

		out.close();

		System.out.println("Object Serialization successfull");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\IO\\Account.txt"));

		System.out.println(in.readObject());

		in.close();
	}

}
