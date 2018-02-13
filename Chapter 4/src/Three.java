
public class Three {
	
/**
 * This program tells you the date in American and European formats
 * Ted Clifford 1.17.18
 */
	
	public static void printEuropean(int day, String date, String month, int year) {
		if (true) {			
			System.out.println("Today is " + date + ", " + day + " " + month + ", " + year);
		}
	}
	public static void printAmerican(int day, String date, String month, int year) {
		System.out.println("Today is " + date + ", " + month + " " + day + ", " + year);
	}
	
	public static void main(String[] args) {
		int day = 17;
		String date = "Wednesday";
		String month = "January";
		int year = 2018;
		printAmerican(day, date, month, year);	
		printEuropean(day, date, month, year);
	}

}