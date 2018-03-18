import java.util.Scanner;
/**
 * Friendly game of hangman!
 * V1.0 Changelog:
 * -Added singleplayer
 * -Manual word choice
 *
 * @author Ted Clifford 3.17.2018
 *
 */
public class HM {

	//Starts a one player game
	public static void onePlayer() {
		int lives = 6;
		
		String actual = randomWord();
		int actualLength = actual.length();
		char[] actualArray = actual.toCharArray();
		char[] guessedArray = new char[actualLength];
		String incorrectGuesses = "";
		
		results(guessedArray, actualArray, actualLength);
		System.out.println();
		
		while(lives>0) {		
			System.out.println();
			char guessedChar = guess();
			for(int i = 0;i<=actualLength;i++) {
				if (i < actualLength && guessedChar == actualArray[i]) {
					for(int j = i;j<actualLength;j++) {
						if(guessedChar == actualArray[j]) {
							guessedArray[j] = guessedChar;	//Something is off here :(
						}
					}
					break;
				}
				if (i == actualLength){
					System.out.println("Wrong! Guesses: " + wrongGuess(incorrectGuesses, guessedChar) + " Lives: " + (lives - 1));
					incorrectGuesses += guessedChar;
					lives --;
				}
			}
			System.out.println();
			results(guessedArray, actualArray, actualLength);
			if(didWin(guessedArray, actualArray, actualLength)) {
				win();
				break;
			}
			if(lives == 0) {
				System.out.println();
				System.out.println("Sorry, you lose :(");
			}
		}
	}
	
	//Starts a two player game
	public static void twoPlayer() {
		
	}
	
	//Picks a random word from a list of words
	public static String randomWord() {
		return("scrabble");
	}
	
	//Takes a guess from the user
	public static char guess() {
		Scanner in = new Scanner(System.in);
		System.out.print("Guess a letter: ");
		String letter = in.nextLine().toLowerCase();
		if(letter.length() == 1) {
			return(letter.charAt(0));
		}
		System.err.println("Please guess just one letter");
		System.out.println();
		return(guess());
	}
	
	//Reacts to an incorrect guess
	public static String wrongGuess(String incorrectGuesses, char guessedChar) {
		return(incorrectGuesses + guessedChar);	
	}
	
	//Prints the current results
	public static void results(char[] guessed, char[] actual, int length) {
		for(int i = 0;i < length; i++) {
			if(guessed[i] == actual[i] && !((int)guessed[i] == 0)) {
				System.out.print(actual[i] + " ");
			}
			else {
				System.out.print("_ ");
			}		
		}
	}
	
	//Checks for win condition
	public static boolean didWin(char[] guessed, char[] actual, int length) {
		for(int i = 0;i < length; i++) {
			if(!(guessed[i] == actual[i] && !((int)guessed[i] == 0))) {
				return(false);
			}
		}
		return(true);
	}
	
	//Win condition
	public static void win() {
		System.out.println();
		System.out.println("Congratulations!, you've won!");
	}
	
	//Clears the console
	public static void clearScreen() {  
	} 
	
	public static void main(String[] args) {	
		System.out.println("Welcome to hangman, here are the rules: \n1) No capital letters \n2) No spaces \n3) Have fun!");
		System.out.println();
		onePlayer();
	}
}
