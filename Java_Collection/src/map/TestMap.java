package map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put( "First", 1);
		m.put("Second ", 2);
		m.put("Third", 3);
		m.put(null, 6);
		m.put('r', 6);
		m.put("Fifth", "Surbhi");
		 
		System.out.println("to get 'speccific vale of the key' : " + m.get("First"));
		
		System.out.println("to get all 'keys and values both' : " + m.entrySet());
		
		System.out.println("to only get 'all the Values' : " + m.values());
		
		System.out.println("to only get 'all the keys' : " + m.keySet());
		
		System.out.println("to get 'the size' of the output : " + m.size());
		
		System.out.println("to get the specific 'key when we enter the value' :  " + m.containsKey(6));
		
		System.out.println("to get the specific 'value when we enter the key' : " + m.containsValue("Fifth"));
		
		System.out.println("to remove only one key and vlaue : " + m.remove('r'));
		
		System.out.println("to remove all the  keys and values : " + m.remove(m));
		
		System.out.println(m);
		
	}
	
}
