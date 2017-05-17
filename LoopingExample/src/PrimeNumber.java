
public class PrimeNumber {
	
	public void displayprimeNumber(){
		for (int i = 2; i < 1000; i++)
		{
			boolean isPrime = true;
			if (i == 2) 
			{
				isPrime = true;
			}
			else if (i % 2 == 0) 
			{
				isPrime = false;
			}
			else 
			{
				for (int j = i/2; j > 1; j--)
				{
					if (i % j == 0) 
					{
						isPrime = false;
					}
				}
			}
			if (isPrime) 
			{
				System.out.println("Prime # : " + i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pNumber = new PrimeNumber();
		pNumber.displayprimeNumber();

	}

}
