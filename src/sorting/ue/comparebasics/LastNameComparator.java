package sorting.ue.comparebasics;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		
		return o1.getLastName().compareTo(o2.getLastName());
	}

}
