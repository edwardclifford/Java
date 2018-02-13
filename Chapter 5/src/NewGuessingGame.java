import java.util.Random;
import java.util.Scanner;

/**
 * Random Number Guessing Game
 * @author Ted Clifford 1.16.18
 *
 */

public class NewGuessingGame {

	
	//Check the guess and figure the difference
	public static void checkGuess(int guess, int number) { 
		if (guess == number) {
			System.out.println("You were right!");
		} else {
			if (guess > number) {
				System.out.println("You were " + (guess - number) + " over");
			} else {
				System.out.println("You were " + (number - guess) + " under");
			}
		}
	}
	
	
	
    public static void main(String[] args) {
        
    	//New variables
        Scanner in = new Scanner(System.in);
        int number;

        //ask user for their guess
        System.out.println("I'm thinking of a number between 1 and 100 \n" 
        		+ "(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        number = in.nextInt();
        System.out.printf("Your guess is: %d\n", number);
        
        //generate random number (error occurs here)
        Random random = new Random();
        int pickle = (random.nextInt(100) + 1);
        System.out.printf("The number I was thinking of is: %d\n", pickle);
        
        checkGuess(number, pickle);
    }
}