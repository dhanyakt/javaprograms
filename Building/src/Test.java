
public class Test {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.sleep();
		Dog d = (Dog) a;
		d.eat();
		((Dog)a).eat();
		
		int x = 7;
		int y= 2;
		System.out.println(x*=x);
		System.out.println(x = x * (x+y));
		boolean prob = true;
		while(true){
			if(prob){
				System.out.println("there is problem");
				break;
			}
			System.out.println("break from inner loop");
		}
		
		System.out.println("break from outer loop");
		int i =0;
		for(i =0; i<10; i++){
			System.out.println("i is "+ i);
			while(i == 0){
				break;
			}
			//System.out.println("break from while loop");
			break;
		}
		System.out.println(i);
		
		
		
		
		
		
	}

}
