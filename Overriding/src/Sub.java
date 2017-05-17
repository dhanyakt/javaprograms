
public class Sub extends Breaker {

	@Override
	void foo() throws RuntimeException{
		super.foo();
		if(true) throw new RuntimeException();
		System.out.println("subclass");
	}

	public static void main(String[] args) {
		try{
			Sub s = new Sub();
			s.foo();
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("done");
			
		}
		

	}

}
