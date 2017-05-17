package com.dhanya.array;

public class Adder  {
	private int one;
	private int two;
	/**
	 * @return the one
	 */
	public int getOne() {
		return one;
	}
	/**
	 * @param one the one to set
	 */
	public void setOne(int one) {
		this.one = one;
	}
	/**
	 * @return the two
	 */
	public int getTwo() {
		return two;
	}
	/**
	 * @param two the two to set
	 */
	public void setTwo(int two) {
		this.two = two;
	}
	
	public int addSum(int a, int b) {
		int sum = a +b;
		System.out.println(sum);
		return sum;
		
	}

}
