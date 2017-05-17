
public class Food {
	
	static int x = 99;
	{
		System.out.println(x);
	}
	
	String name = "jam";
	
	public Food(){
		System.out.println("print no arg superclass constructor");
	}
	
	/*public Food(String name) {
		this.name = name;
		System.out.println("initliazed the name var and created" + " " + this.name + " " + name);
	}*/
	
	

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		//Init init = new Init();
		Init in = new Init(7);
		//Food f = new Food("one");
	}


}
