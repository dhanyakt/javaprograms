package com.dhanya.constructors;

public class Test1 {
	String name;
	
	static{
		System.out.println("static");
	}
	{
		System.out.println("Instance");
	}
	
	protected Test1(){
		
		System.out.println("constructor");
	}
	
	public Test1(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = null;

	}

}
