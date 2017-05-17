package com.dhanya.sample;

public class Second extends One {
	int j = 11;
	public void printValue(String s ) {
		System.out.println("Overloaded method ");
	}


	/* (non-Javadoc)
	 * @see com.dhanya.sample.One#printValue()
	 */
	@Override
	public void printValue() {
		// TODO Auto-generated method stub
		System.out.println("Value B");
	}
	
}
