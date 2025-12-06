package list;

import java.util.ArrayList;
import java.util.Collection;

public class ListTask {

	public static void main(String [] args) {
		
		
		Collection c = new ArrayList();
		
		c.add("Bura mat dekho");
		c.add("Bura mat kro");
		c.add("Bura mat suno");
		
		System.out.println("Length of the collection : " + c.size());
		
		for(Object o : c) {
			System.out.println(o);
		}
		
		Object[] hArray =  c.toArray();
		
		for(Object o : hArray) {
			String s = (String)o;
			System.out.println(s);
		}
		
	}
}
