package com.dhanya.collections;

public class New {
	public enum Dogs {collie, harrier, shepherd};

	public static void main(String[] args) {
		
		
		Dogs myDog = Dogs.shepherd;
		 switch (myDog) {
		 case collie:
		 System.out.print("collie ");
		
		case harrier:
		 System.out.print("harrier ");
		 
		 default:
			System.out.print("retriever ");
			break;
		 }
		String str = "null";
		if (str == null) {
		System.out.println("null");
		//} else (str.length() == 0) {
		//System.out.println("zero");
		} 
		else {
		System.out.println("some");
		}

	}

}
