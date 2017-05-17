
public class MyException extends Exception{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		MyException e = new MyException();
		e.someMethod();
	}

	private void someMethod()  {
		try {
			doStuff();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doStuff() throws MyException {
		System.out.println("xyz");
		
		
	}

}
