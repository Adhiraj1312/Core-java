package com.rays.stream;

import java.util.ArrayList;

public class TestStream {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("Yash");
		l.add("Adhi");
		l.add("Neha");
		l.add("Arpit");
		l.add("Yash");
		l.add("Arun");
		l.add("Anant");
		l.add("Sakshi");
		l.add("riddhi");
		l.add("Riddhi");
		
		
		l.forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		
		l.stream().sorted().distinct().forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		
		l.stream().filter(e -> e.startsWith("A")).distinct().forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		
		l.stream().map(e -> e.toLowerCase()).filter(e -> e.startsWith("y")).distinct().forEach(System.out::println);
	}
	
}
