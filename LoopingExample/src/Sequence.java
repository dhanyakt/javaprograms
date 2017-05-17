
public class Sequence {
	
	public int previous_num =1;
	public int next_num =1;
	
	public void displaySequence(){
		 // 1 1 2 3 5 8...
		
		int count = 0;
		while(count < 10)
		{
			if(count == 0)
			{
				System.out.println(previous_num);
			}
			else if(count == 1)
			{
				System.out.println(next_num);
			}
			else 
			{
				int next_value = next_num + previous_num;
				previous_num = next_num;
				next_num = next_value;
				System.out.println(next_value);
			}
			count ++;
		}
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sequence sequence = new Sequence();
		sequence.displaySequence();
		

	}

	
}
