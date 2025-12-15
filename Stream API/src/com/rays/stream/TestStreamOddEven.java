package com.rays.stream;

import java.util.ArrayList;

public class TestStreamOddEven {

	public static void main(String[] args) {

		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int i = 1 ; i<= 20; i++) {
			
			l.add(i);
			//System.out.println(l);
		}
		
		   l.stream().filter(e -> e % 2 != 0).forEach(System.out::println);
		   
		   System.out.println("----------------------------------");
		
		   
		   l.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
	}
	
}
