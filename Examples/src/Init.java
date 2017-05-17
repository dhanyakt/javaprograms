
public class Init extends Food {
	
	Init(int x){
		this();
		
		System.out.println("1-arg-const");
		
		
	}
	Init(){
		System.out.println("no-arg const");
	}
	static {
		System.out.println("ist static init");
	}
	{
	System.out.println("1st instance init");
	}
	{
		System.out.println("2nd instance");
	}
	static{
		System.out.println("2nd static init");
	}
}
