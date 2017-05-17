package com.dhanya.array;

public class Test {
	static Boolean bl[] = new Boolean[5];
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String... args){
		int[] arr = new int[10];
		System.out.println(arr[1]);
		int i =5;
		arr[i++] = i+++i++;
		int z = i+++i++;
		System.out.println(z);
		System.out.print(arr[5]+":"+arr[6]);
		 System.out.println(bl[0]);
		
		
		

	}

}
