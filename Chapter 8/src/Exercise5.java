import java.util.Scanner;

/*
 * Sieve of Eratosthenes
 * 
 * This program takes a user input as the maximum number in an array, then sorts the array
 * (made up as booleans) into primes and non-primes. The primes are marked as 'true' and the non
 * primes are marked as 'false'. The user can then request a number, and the status of that number
 * ('true' or 'false') is returned as an output.
 * 
 *  Ted Clifford 3.6.2018
 *  
 */

public class Exercise5 {
	
	public static void main(String[] args) {
		
		//User input for max number (n)
		Scanner in = new Scanner(System.in);
		System.out.print("What is your maximum number? ");
		int n = in.nextInt() + 1;
		System.out.println();
		
		//Creates an array with n booleans, setting all but 0, 1 to 'true'
		boolean[] primes = new boolean[n];

		for(int i = 2; i < n; i++) {	
			primes[i] = true;
		}
		
		//Scans through array and sets primes as 'true' and all non-primes as 'false'
		for(int i = 0; i < n; i++) {
			if (primes[i] == true) {
				for(int j = i*2; j < n; j+=i) {
					primes[j] = false;
				}
			}
		}
		
		//Outputs the prime status on the number (check) requested by the user
		System.out.print("Which number would you like to check prime status on? ");
		int check = in.nextInt();
		System.out.println();
		
		if (primes[check] == false) {
			System.out.println(check + " is not prime.");
		}
		else {
			System.out.println(check + " is prime!");
		}
		
		in.close();
	}
}
