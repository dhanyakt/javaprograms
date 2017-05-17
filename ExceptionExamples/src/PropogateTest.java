
public class PropogateTest {
	
	
	public static void main(String[] args)  {
		
		String stringOne = "";

		try {
			String stringTwo = reverse(stringOne);
			System.out.println("Returned String: [" + stringTwo + "]");
		} 
		catch (Exception e) {
			System.err.println("Caught Exception: " + e.getMessage() + "\n");
		}
		finally {
			System.out.println("Main method completed");
		}
		
	}

	private static String reverse(String stringOne) throws Exception 
	{
		String reverseStr ="";
		if(stringOne.length()==0)
		{
			throw new Exception("Empty string passed for reversal!");
		}
		else{
			for(int i=stringOne.length()-1;i>=0;--i){
				reverseStr += stringOne.charAt(i);
			}
		}
		return reverseStr;
	}
}
		