
public class WhileRectangle {
	public int height = 3;
	public int width = 10;
	
	
	
	public void displayRectangle(){
		
		int colcount = 0;
		int rowcount = 0;
		
		while(rowcount < height){
			colcount =0;
			
			while(colcount < width){
				System.out.print("@");
				colcount++;
				
			}
			
			System.out.println(" ");
			rowcount++;
			
		}
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WhileRectangle whileRectangle = new WhileRectangle();
		 whileRectangle.displayRectangle();

	}

}
