
public class Ebb {

	static int x = 7;
	public static void main(String[] args) {
		String s = "-";
		for(int y= 0; y< 3; y++){
			System.out.println(y);
			x++;
			System.out.println("Value of x:" + x);
			switch(x){
				case 8: s+= "8";
				case 9: s+= "9";
				case 10: s+= "10";
					break;
				default:s+="d";
				case 13: s+= "13";
			}
		}
		System.out.println(s);
	}
		static {
			x++;
			System.out.println("Value of x:" + x);
		}
}
