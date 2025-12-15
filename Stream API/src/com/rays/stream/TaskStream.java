package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TaskStream {

	public static void main(String[] args) {

		ArrayList<Contastant> l = new ArrayList<Contastant>();

		l.add(new Contastant("Ram", "9263924708"));
		l.add(new Contastant("Arun", "9424090602"));
		l.add(new Contastant("Riddhi", "9424095741"));
		l.add(new Contastant("Adhiraj", "9263924708"));
		l.add(new Contastant("Shruti", "9424060472"));
		l.add(new Contastant("Satayam", "9263756708"));
		l.add(new Contastant("Saket", "9263924708637"));
		l.add(new Contastant("Yash", "9263929574"));

		System.out.println("----------Get phone number-------------");

		l.stream().map(e -> e.phone).forEach(System.out::println);

		System.out.println("-----------Get valid Number-----------------------");

		l.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(System.out::println);

		System.out.println("-------------Remove duplicate-------------------------");

		l.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(System.out::println);

		System.out.println("--------------Shuffle---------------------");

		l.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(System.out::println);

	}

}
