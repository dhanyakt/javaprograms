
public class StaticTest extends StaticSuper{
	
	
	static{
		System.out.println("print subclass static stmt");
	}
	static int rand=1;
	static{
		rand = (int) (Math.random() * 6);
		System.out.println("print" + rand);
	}
	
	public StaticTest() {
		// TODO Auto-generated constructor stub
		System.out.println("subclass constructor is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print main");
		StaticTest s = new StaticTest();
		String str ="";
		int len = str.length();
		System.out.println(len);
		

	}

}
