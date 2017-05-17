
public class Rectangle {
	private int height;
	private int width;
	private int area;
	private int perimeter;
	
	public void setHeight(int h){
		if(h > 0 && h < 30){
			height = h;
		}
		else{
			System.out.println("Enter value between 0 and 30");
		}
	}
	
	public int getHeight(){
		return height;
	}
	
	
	public void setWidth(int w){
		if(w >0 && w < 30){
			width = w;
		}
		else {
			System.out.println("Enter value between 0 and 30");
		}
	}
	
	public int getWidth(){
		return width;
	}
	
	// Calculate Area of Rectangle
	public int getArea(){
		 area = getHeight() * getWidth();
		return area;
	}
	
	// calculate perimeter of rectangle
	public int getPerimeter(){
		 perimeter = 2 *(height + width);
		return perimeter;
	}
	
	public void draw(){
		int rect_height = getHeight();
		int rect_width = getWidth();
		
		// Outer loop responsible for moving from one row to another
		for(int rowCount=1; rowCount<= rect_height; rowCount++){
			System.out.println(rowCount);
			
			//Inner loop responsible for printing * charachter
			for( int colCount=0; colCount <= rect_width; colCount++ ){
				System.out.print("*"); 
			} 
			System.out.println("yes");
			 
		}
		
		
	}

}
