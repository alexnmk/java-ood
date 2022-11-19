/**
 * Runner.java
 * - demonstrating basic casting between parent and child classes
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	20/10/22
 */

class Parent {

	String name;
	int age;
}

class Child extends Parent {

	String school;
}


class Runner {

	public static void main(String[] args) {
	
		Child child = new Child();
		child.name = "Abdullah";
		child.age = 14;
		child.school = "FDM Junior Academy";
		
		
		Parent parent = child;
		
		
		Child child2 = (Child) parent;
		
		System.out.println(child2.name);
		System.out.println(child2.age);
		
		System.out.println(child2.school);
		
		
	}

}
