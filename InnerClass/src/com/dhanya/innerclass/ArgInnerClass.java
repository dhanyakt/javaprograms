package com.dhanya.innerclass;

public class ArgInnerClass {
	
	interface Foo{
		public void foof();
	}
	
	class Bar{
		void doStuff(Foo f) {
	   }
	}

	public static void main(String[] args) {
		System.out.println("****************************************");
		z:
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 2; y++) {
				if(x==1) break;
				if(x==2 && y==1) break z;
				System.out.println("x:" + x + " y: " + y);
			}
			System.out.println("****************************************x:" +x);
		}
		System.out.println("Test");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	private void go() {
		Bar b = new Bar();

		b.doStuff(new Foo() {
			
			@Override
			public void foof() {
				System.out.println("foofy");
			}
		});
		
		
		
	}
}
