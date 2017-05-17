
public class Triangle {
	
	
	private void displayTriangle() {
		int n = 4;
		
		for (int i = 1; i <= n; i++) {
			for(int j=1;j<=n;j++) {
			//for (int j = n; j > 0; j --) {
				if (j <= i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
		int total_stars = 1;
		// main loop
		/*for(int i=2;i>0;i--)
		{
			StringBuffer stringBuffer = new StringBuffer();
			// spaces
			for(int j=i;j>0;j--){
				//stringBuffer.append("-");
			}
			System.out.print(stringBuffer.toString());
			
			// System.out.println("*" + total_stars);
			for (int x = 1; x <= total_stars; x++) {
				 System.out.print("*");
				 
			}
			total_stars++;
			
				
		}
		*/
	
		
		

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.displayTriangle();
	}
}
