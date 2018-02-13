import java.util.Random; //error occurs here, too
import java.util.Scanner;

/**
 * Random Number Guessing Game
 * @author Ted Clifford 1.16.18
 *
 */

public class InchesToCentimeters {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int number;
        int difference;
        
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
        
        //respond to the user with the error
        difference = pickle - number;
        System.out.printf("You were off by: %d", difference);
        
        in.close();
    }
}