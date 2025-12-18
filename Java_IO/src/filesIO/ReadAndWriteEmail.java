package filesIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteEmail {

	public static void main(String[] args) throws IOException {

		FileReader source = new FileReader("D:\\IO\\Email.txt");

		FileWriter target = new FileWriter("D:\\IO\\ValidEmails.txt");

		BufferedReader r = new BufferedReader(source);
		BufferedWriter w = new BufferedWriter(target);

		String email = r.readLine();

		while (email != null) {

			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
				w.write(email);
				w.newLine();
			}

			email = r.readLine();
		}
		r.close();
		w.close();

	}
}