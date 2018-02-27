import java.util.Scanner;

public class Problems1 {

	/**
	 * 
	 * A collection of problems from 
	 * https://www.w3resource.com/java-exercises/conditional-statement/index.php
	 * solved in individual classes.
	 * Ted Clifford - 1.31.2018
	 * 
	 */
	//1
	public static void evenOdd() { //Tests whether an input integer is even or odd
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int value = in.nextInt();	//Take input from the user
		
		if (value % 2 == 0)		//Check to see if it is even or odd and prints result
			System.out.println("Your number was even!");
		else
			System.out.println("Your number was odd!");
	
		in.close();
		
	}
	//2
	public static void quadratic() { //Finds the roots of 3 variables using the quadratic equation
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a: ");
		double a = in.nextDouble();
		
		System.out.print("Input b: ");
		double b = in.nextDouble();

		System.out.print("Input c: ");
		double c = in.nextDouble();
		
		System.out.println();
		System.out.print("The roots are ");
		System.out.print((-b + (Math.sqrt(Math.pow(b, 2) * (4 * a * c)))) / (2 * a));
		System.out.print(" and ");
		System.out.print((-b - (Math.sqrt(Math.pow(b, 2) * (4 * a * c)))) / (2 * a));
		
		in.close();
		
	}
	//3
	public static void greatest() { //Prints the greatest of three numbers
		
		Scanner in = new Scanner(System.in);
			
		System.out.print("Input 1st number: ");		//Takes input from users
		int a = in.nextInt();
		
		System.out.print("Input 2nd number: ");
		int b = in.nextInt();

		System.out.print("Input 3rd number: ");
		int c = in.nextInt();
		
		if (a > b && a > c)		//Finds the greatest number
			System.out.println(a);
		else if (b > a && b > c)
			System.out.println(b);
		else
			System.out.print(c);
		
		in.close();
		
	}
	//4
	public static void attributes() { //Assigns english attributes to floating point numbers
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input value: "); //Takes input from the user, assigns it to "a"
		double a = in.nextDouble();
		
		if (a == 0) 	//Finds a on the number line
			System.out.println("Zero");
		else if (a > 0)
			if (a < 1)
				System.out.println("Small positive number");
			else if (a > 1000000)
				System.out.println("Large positive number");
			else
				System.out.println("Positive number");
		else
			System.out.println("Negative number");
		
		in.close();
		
	}
	//5
	public static void day() { //Takes a number from the user and assigns a day of the week
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input value: ");		//Input from user
		int day = in.nextInt();
		
		if (day == 1)		//Find the day
			System.out.println("Monday");
		else if (day == 2)
			System.out.println("Tuesday");
		else if (day == 3)
			System.out.println("Wednesday");
		else if (day == 4)
			System.out.println("Thursday");
		else if (day == 5)
			System.out.println("Friday");
		else if (day == 6)
			System.out.println("Saturday");
		else if (day == 7)
			System.out.println("Sunday");
		else {
			System.out.println("Please pick a number between 1 and 7"); //If a number outside of 1-7 is chosen, the user is prompted to try again
			day();
			
		in.close();
			
		}
	}	
	//6
	public static void sameCheck() { //Checks 2 floats to see if they are the same up to 3 decimals
		
		Scanner in = new Scanner(System.in);
		
		//User input
		System.out.print("Input floating point number: ");
		double a = in.nextDouble();
		System.out.print("Input another floating point number: ");
		double b = in.nextDouble();
		
		//Round numbers to thousandths place
		int roundA = (int) Math.round(a * 1000);
	
		int roundB = (int) Math.round(b * 1000);
	
		
		//Print results
		if ((roundA / 1000) == (roundB / 1000))
			System.out.println("They are the same");
		else
			System.out.println("They are not the same");
		
		in.close();
		
	}
	//7
	public static void month() { //Takes a month and year and returns the amount of days in that month
		
		//New Scanner
		Scanner in = new Scanner(System.in);
		int days = 0;
		String time = "Pickle";
		
		//User input
		System.out.print("Input a month number: ");
		int month = in.nextInt();
		System.out.print("Input a year: ");
		int year = in.nextInt();
		
		//Find the amount of days in a month
		if (month == 1) {
			days = 31;
			time = "January";
		}
		else if (month == 2) {	//The amount of days in Febuary depends on if the year is a leap year
			if (year % 4 == 0) {
				days = 29;
				time = "Febuary";
			}
			else {
				days = 28;
				time = "Febuary";
			}
		}
		else if (month == 3) {
			days = 31;
			time = "March";
		}
		else if (month == 4) {
			days = 30;
			time = "April";
		}
		else if (month == 5) {
			days = 31;
			time = "May";
		}
		else if (month == 6) {
			days = 30;
			time = "June";
		}
		else if (month == 7) {
			days = 31;
			time = "July";
		}
		else if (month == 8) {
			days = 31;
			time = "August";
		}
		else if (month == 9) {
			days = 30;
			time = "September";
		}
		else if (month == 10) {
			days = 31;
			time = "October";
		}
		else if (month == 11) {
			days = 30;
			time = "November";
		}
		else if (month == 12) {
			days = 31;
			time = "December";
		}
		else {
			System.out.println("You did not enter valid values, try again");
			month();
		}
		
		System.out.println(time + " " + year + " has " + days + " days");
		
		in.close();
		
	}
	//8
	
	//9
	public static void isLeapYear() { //Checks if a year is a leap year
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input the year: ");
		int year = in.nextInt();
		
		if (year % 4 == 0) 
			System.out.print(year + " is a leap year");
		else
			System.out.print(year + " is not a leap year");
		
		in.close();
	}
	//10
	public static void numberList() { //Provides a list of numbers from 1-10
		
		int i = 1;
		
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
	}
	//11
	public static void listAndSum() { //Provides a list of numbers up to n, and n's sum

		Scanner in = new Scanner(System.in);
		int i = 1;
		
		System.out.print("Input number: ");
		int number = in.nextInt();
		
		System.out.println("The first " + number + " natural numbers are:");
		
		while (i <= number) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("The sum of natural numbers up to " + number + " are:");
		System.out.println(listAndSumLoop(number));
				
		in.close();
		
	}
	//11
	public static int listAndSumLoop(int n) { //Serves to find the sum of all natural numbers leading up to n, used in listAndSum

		int sum;
		if (n == 0)
			return(0);
		else {
			sum = n + listAndSumLoop(n-1);
			return(sum);
		}
		
	}
	//12
	public static void mean() { //Finds the sum and mean of 5 numbers

		Scanner in = new Scanner(System.in);
		
		//Collect 5 inputs
		System.out.println("Input the 5 numbers:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		
		//Print the sum of the 5 numbers
		final int SUM = (a + b + c + d + e);
		System.out.println("The sum of these 5 numbers is: " + SUM);
		System.out.println("The average is: " + SUM / 5);
		
		in.close();
		
	}
	//13
	public static void cube() { //Find the cube of all numbers up to n
		//Initiate varaibles and Scanner
		Scanner in = new Scanner(System.in);
		int i = 1;
		
		//Take user input
		System.out.print("Input number of terms: ");
		int number = in.nextInt();
		
		//Print table
		while (i <= number) {
			System.out.println("Number is " + i + " and the cube of " + i + " is: " + (int)Math.pow(i, 3));
			i++;
		}
		
		in.close();
		
	}
	//14
	public static void table() { //Returns the multiplication table for a specific number of terms
		//Iniates the variables
		Scanner in = new Scanner(System.in);
		int i = 0;
		
		//Takes the users input
		System.out.print("Input the number: ");
		int number = in.nextInt();
		System.out.print("Input the number of terms: ");
		int terms = in.nextInt();
		
		//Prints multiplication table
		while (i <= terms) {
			System.out.println(number + " X " + i + " = " + (number * i));
			i++;
		}
		
		in.close();
	}
	//15
	public static void odds() { //Returns the sum of odd numbers leading up to n
	
		Scanner in = new Scanner(System.in);
		int i = 1;
		
		System.out.print("Input number of terms: ");
		int terms = in.nextInt();
		
		System.out.println("The odd numbers are:");
		
		while (i <= terms) {
			System.out.println(i);
			i = i + 2;
		}
		
		in.close();
		
	}
	//16
	public static void angle() { //Creates a triangle of numbers based on an inputed number
		
		Scanner in = new Scanner(System.in);
		int i = 1;
		int j = 1;
		
		System.out.print("Input number of rows: ");
		int rows = in.nextInt();
		
		for(i=1;i<=rows;i++) 
		{
			for(j=1;j<=i;j++)
			  System.out.print(j);

		    System.out.println("");
		}
		
		in.close();
	}
	//17
	public static void repeatTriangle() { //Creates a triangle of numbers, where the lines represent a repeeating number
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	
	}
	//18
	public static void countingTriangle() {	//Creates a triangle where none of the numbers repeat
		
		int n = 1;
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n);
				System.out.print(" ");
				n++;
			}
			System.out.println("");
		}
		
	}
	//19 -- Help with triangle problems (19-26)
	public static void repeatingPyramid() {	//Creates a pyramid whose rows contain the same repeating number
	
			int i,j,n,s,x;
			System.out.print ("Input number of rows : ");
			Scanner in = new Scanner(System.in);
			n = in.nextInt();

			s=n+4-1;
			for(i=1;i<=n;i++) {
				for(x=s;x!=0;x--) {
					System.out.print(" ");
				}
				for(j=1;j<=i;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
				s--;
			}
		
			in.close();
		
	}
	//27 (Same as #1)
	public static void integerCheck() { //Checks whether an integer is positive, negative, or zero
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int n = in.nextInt();
		
		if (n % 2 == 0 && n != 0) {
			System.out.println("Positive");
		}
		else if (n % 2 != 0 && n != 0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		
		in.close();
		
	}
	//28 (Same as #4)
	public static void integerValue() { //Assigns attributes to integers based on their location and side	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input value: "); //Takes input from the user, assigns it to "a"
		double a = in.nextDouble();
		
		if (a == 0) 	//Finds a on the number line
			System.out.println("Zero");
		else if (a > 0)
			if (a < 1)
				System.out.println("Small positive number");
			else if (a > 1000000)
				System.out.println("Large positive number");
			else
				System.out.println("Positive number");
		else
			System.out.println("Negative number");
		
		in.close();
		
	}
	
	public static void main(String[] args) {
		repeatingPyramid();
	}
	
}
