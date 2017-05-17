package com.dhanya.array;


public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] first = {1,2,3};
		int[] second = {4,5,6,7};
		int [] combined = new int[first.length + second.length]; 
		System.arraycopy(first, 0, combined, 0, first.length);
		System.arraycopy(second, 0, combined, first.length, second.length);
		System.out.println("First Array");
		for (int value : first) {
			System.out.print(value + ",");
		}
		System.out.println("\nSecond Array");
		for (int value : second) {
			System.out.print(value + ",");
		}
		System.out.println("\nCombined Array");
		for (int value : combined) {
			System.out.print(value + ",");
		}
		
	}

}
