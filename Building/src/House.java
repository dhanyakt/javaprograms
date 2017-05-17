
public class House extends Building{

	/*public House() {
		System.out.println("print subclass constructor-----> no args");
	}*/
	
	
	public House(String color){
		System.out.println("print the subclass cons with args----> " + color);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h = new House("blue");
		float f = 149.678f;
		short s = (short) f;
		System.out.println(s);
		
		char sure = 'c';
		switch(sure){
		case 'a':
			System.out.println("print it is character a");
			break;
		case 'b':
			System.out.println("print it is character b");
			break;
		default:
			System.out.println("its is ok !!!!!!!!");
			break;
		case 'd':
			System.out.println("this is  not correct");
			break;
			
		}
		
	}


}
