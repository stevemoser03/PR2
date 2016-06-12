package sorting.ue.empoyees;

import java.util.Arrays;
import java.util.Collections;

class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*VERGLEICH MIT COMPAREABLE EMPNUMBER
		 * Employee [] emplist = {new Employee(222,"Steve",1000.0,"HR"),new Employee(111,"Luki",10000.0,"CEO"),new Employee(1,"Mia",100.0,"HR")};
		
		
		
		for (Employee e : emplist) {
			System.out.println(e);
		}
		
		Arrays.sort(emplist);
		
		for (Employee e : emplist) {
			System.out.println(e);
		}
		*/
		
		//VERGLEICH MIT COMPARATOR -> NAMENSSORTIERUNG
		  Employee [] emplist = {new Employee(222,"Steve",1000.0,"HR"),new Employee(111,"Luki",10000.0,"CEO"),new Employee(1,"Mia",100.0,"HR")};
		
		
		
		for (Employee e : emplist) {
			System.out.println(e);
		}
		
		Arrays.sort(emplist, new EmployeeNameComp());
		
		for (Employee e : emplist) {
			System.out.println(e);
		}
		
		
	}
	
	

}
