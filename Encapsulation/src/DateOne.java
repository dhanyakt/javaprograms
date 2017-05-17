
public class DateOne {
	
	public int month;
	public int date;
	public int year;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateOne dateOne = new DateOne();
		dateOne.month = 02;
		dateOne.date = 22;
		dateOne.year = 2016;
		dateOne.displayDate();
		
		DateTwo dTwo = new DateTwo();
		dTwo.setMonth(02);
		dTwo.setDate(25);
		dTwo.setYear(2016);
		
		int date_var = dTwo.getDate();
		dTwo.getMonth();
		dTwo.getYear();
		System.out.println("Print" + date_var);
		
	}


	private void displayDate() {
		// TODO Auto-generated method stub
		System.out.println("Print " + month +"/" + date +"/" + year);
		
	}


	

}
