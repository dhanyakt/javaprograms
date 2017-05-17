
public class Propogate {
	
	
	public static void main(String[] args)  {
		
		String stringOne = "";
		
		try {
				String stringTwo = reverse(stringOne);
		} 
		catch (Exception e) {
			
			System.out.println("exception caught zero length string");
			e.printStackTrace();
		}
		finally{
			System.out.println("Main method completed");
		}
		
	}

	private static String reverse(String stringOne)  throws Exception {
		
		String reverseStr ="";
		if(stringOne.length()==0){
				
		}
		else{
			for(int i=stringOne.length()-1;i>=0;--i){
				reverseStr += stringOne.charAt(i);
			}
		}
		return reverseStr;
	}
}
		