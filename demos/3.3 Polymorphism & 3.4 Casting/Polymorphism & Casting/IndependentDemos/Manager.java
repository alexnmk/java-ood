/**
 * Manager.java
 * - demonstrating basic inheritance and testing casting between manager and employee
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	20/10/22
 */


import java.util.List;

class Employee {

	protected String name = "";
	protected String jobTitle = "";
	protected int salary = 0;
	
	public void work() {}
}


class Manager extends Employee {

	
//	protected String name;
//	protected String jobTitle;
//	protected int salary;
	
	
	// child specific attribute
	public List<Employee> team;
	
	public void manager() {}	
	
	
	public void anotherMethod() {}
	
	
	public static void main(String[] args) {


		Child child = new Child("John", 13, "school");
		
		Parent parent = child;
		parent.name();
		
		Child child = (Child) parent;

		
		
	}
}
