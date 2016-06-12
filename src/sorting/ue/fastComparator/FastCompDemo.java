package sorting.ue.fastComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FastCompDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> p = new ArrayList<>();
		
		p.add(new Person("Steve","Moser"));
		p.add(new Person("Melanie","Baumhackl"));
		
		Collections.sort(p, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		
		for (Person person : p) {
			System.out.println(person);
		}
		
	}

}
