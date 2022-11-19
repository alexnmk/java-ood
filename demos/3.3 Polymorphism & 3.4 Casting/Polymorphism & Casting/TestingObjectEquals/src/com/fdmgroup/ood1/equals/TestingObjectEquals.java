/**
 * TestingObjectEquals.java
 * - describing what this class does
 * 
 * @author	S. Aziz
 * @version	0.0.1
 * @since	20/10/22
 */

package com.fdmgroup.ood1.equals;

import java.util.Objects;

public class TestingObjectEquals {

	private int id;
	private String name;
	private int phoneNumber;
	private boolean isRound;
	
	
	
	public TestingObjectEquals(int id, String name, int phoneNumber, boolean isRound) {
		super();
		
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.isRound = isRound;
	}
	
	
	
	



	@Override
	public int hashCode() {
		return Objects.hash(id, isRound, name, phoneNumber);
	}







	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		TestingObjectEquals other = (TestingObjectEquals) obj;
		
		
		return id == other.id && isRound == other.isRound && Objects.equals(name, other.name)
				&& phoneNumber == other.phoneNumber;
	}







	public static void main(String[] args) {
		
		TestingObjectEquals obj1 = new TestingObjectEquals(1, "Shri", 12345678, true);
		TestingObjectEquals obj2 = new TestingObjectEquals(1, "Shri", 12345678, true);
		
//		TestingObjectEquals obj2 = new TestingObjectEquals(2, "Clement", 12345678, false);
		
		
		
		System.out.println(obj1.equals(obj2));
	}

}
