package com.dhanya.innerclass;

public class Food {

	public static void main(String[] args) {
		
		Food f = new Food();
		f.bake();
		Cookable c = new Cookable() {
			
			@Override
			public void cook() {
				System.out.println("make the dinner");
				
			}
		};

	}
	
	private void bake() {
		Cookable c = new Cookable() {
			
			@Override
			public void cook() {
				System.out.println("bake the cake");				
			}
		};
		// c.cook();
	}

	interface Cookable{
		public void cook();
	}
	
	

}
