
public class Dog extends Animal {
	private String name;
	private int size;

	
	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
	
	public void eat(){
		System.out.println("Dog is eating");
	}
	
	

}
