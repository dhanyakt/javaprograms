package com.dhanya.sample;

public class Person {
	
	private String firstName = "";
	
	private String lastName = "";
	
	private int age;
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		Person person = (Person) obj;
		
		System.out.println("Comparing using rule: firstName.equals(person.firstName) && lastName.equals(person.lastName) && age == person.age");
		if (firstName.equals(person.firstName) && lastName.equals(person.lastName) && age == person.age) 
		{
			System.out.println("Returning true");
			return true;
		}
		else
		{
			System.out.println("Returning false");
			return false;
		}
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
