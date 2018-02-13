import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {
		//This program will ask users for a temperature in C and return a value in F
		Scanner in = new Scanner(System.in); //scanner function called "in"
		double c; //variable for celsius
		double f; //variable for fahrenheit
		
		System.out.print("Input the temprature in Celcius: "); //prompt the user for input
		c = in.nextDouble(); //read user input of celsius
		f = c * (9/5) + 32; //convert celsius to fahrenheit
		System.out.printf("%.1f C = %.1f F", c, f); //output results
	}

}
