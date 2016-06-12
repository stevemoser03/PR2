package org.campus02.comparebasics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonCompareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*VERGLEICH MIT COMPAREABLE
		
		Person [] people = {new Person(333,"Steve","Moser"),new Person(111,"Melanie","Moser"),new Person(3,"Mia-Sophie","Moser")};
		
		
		Arrays.sort(people);
		for (Person person : people) {
			System.out.println(person);
		}
		---------------------------------------------------------
		*/
		
		List<Person> peoplelist = new ArrayList<>();
		peoplelist.add(new Person(333,"Steve","Moser"));
		peoplelist.add(new Person(111,"Melanie","Baumhackl"));
		peoplelist.add(new Person(3,"Mia-Sophie","Moser"));
		
		/*----------------------------------------------------------
		 * VERGLEICH MIT COMPAREABLE
		Collections.sort(peoplelist);
		
		for (Person p : peoplelist) {
			System.out.println(p);
		}
		*/
		
		//VERGLEICH MIT COMPERATOR
		
		Collections.sort(peoplelist, new LastNameComparator());
		for (Person person : peoplelist) {
			System.out.println(person);
		}
		
		
		
	}

}
