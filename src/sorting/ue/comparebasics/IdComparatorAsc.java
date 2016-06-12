package sorting.ue.comparebasics;

import java.util.Comparator;

public class IdComparatorAsc implements Comparator<Person> {
	
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		if(o1.getId() > o2.getId()) return 1;
		if(o1.getId() < o2.getId()) return -1;
		return 0;
	}

	
}
