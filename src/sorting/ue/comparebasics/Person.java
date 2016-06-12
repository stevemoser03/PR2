package sorting.ue.comparebasics;

public class Person implements Comparable<Person> {

	
	private int id;
	private String firstName;
	private String lastName;
	
	
	
	

	public Person(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(this.id < o.id) return -1;
		if(this.id > o.id) return 1;
		return 0;
	}

}
