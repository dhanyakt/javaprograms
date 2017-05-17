/**
 * 
 */
package com.dhanya.sample;

/**
 * @author sanjudhanya
 *
 */
public class ComparePerson {
	
	
	public void comparePersonObjects()
	{
		Person firstPerson = new Person();
		// firstPerson.setAge(100);
		Person secondPerson = new Person();
		secondPerson = firstPerson;
		System.out.println("firstPerson --> " + firstPerson);
		System.out.println("secondPerson --> " + secondPerson);
		System.out.println("firstPerson.equals(secondPerson) --> " + firstPerson.equals(secondPerson));
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComparePerson comparePerson = new ComparePerson();
		comparePerson.comparePersonObjects();
	}

}
