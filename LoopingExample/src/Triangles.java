
public class Triangles {

	public void drawTriangle()
	{
		int count = 1;
		for (int i = 10; i >= 0; i--) 
		{
			// imaginary spaces
			StringBuffer stringBuffer = new StringBuffer();
			for (int j = i;j > 0; j--) 
			{
				stringBuffer.append(" ");
			}
			System.out.print(stringBuffer.toString());
			
			// triangle draw
			StringBuffer starBuffer = new StringBuffer();
			for (int k = count; k > 0; k--)
			{
				starBuffer.append("* ");
			}
			System.out.print(starBuffer.toString());
			System.out.print("\n");
			count++;
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		Triangles triangles = new Triangles();
		triangles.drawTriangle();
	}

}
