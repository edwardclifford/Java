/*
 * By far the hardest and longest exercise so far. Spent 3+ hrs and a lot of brain cells on this one.
 * Definetly improved my understanding of transversals though :)
 * 
 * Ted Clifford 3.6.2018 - 3.8.2018
 */

public class Exercise4 {
	
	/**
 	* Returns the first character of the given String.
 	*/
	public static char first(String s) {
    	return s.charAt(0);
	}
	
	/**
 	* Returns all but the first letter of the given String.
 	*/
	public static String rest(String s) {
    	return s.substring(1);
	}
	
	/**
 	* Returns all but the first and last letter of the String.
 	*/
	public static String middle(String s) {
    	return s.substring(1, s.length() - 1);
	}
	
	/**
 	* Returns the length of the given String.
 	*/
	public static int length(String s) {
    	return s.length();
	}
	
	//Prints a string with one letter on each line
	public static void printString(String s) {
		
		int length = length(s);
		for(int i=0;i<length;i++) {
			if (i == 0) {
				System.out.println(first(s));
			}
			else {
				System.out.println(first(rest(s)));
				s = rest(s);
			}
		}
		
	}
	
	//Creates a char[] array with the reverse contents of String s
	public static void printBackward(String s) {	
		
		int length = length(s);
		int j = length-1;
		char[] s2 = new char[length];
		//Reverses S in a char[]
		for(int i=0;i<length;i++) {
			if (i == 0) {
				s2[length-1] = first(s);
				j--;
				s = rest(s);
			}
			else {
				s2[j] = first(s);
				j--;
				s = rest(s);
			}	
		}
		//Prints char[] (s2)
		for (int i=0;i<length;i++) {
			System.out.println(s2[i]);
		}
				
	}
	
	//Takes a string and sorts it backwards, returning the new string.
	public static String reverseString(String s) {	
		
		int length = length(s)-1;	//Index counter
		int j = length;		//Counter (2)
		String newString = "";	//Storage string
		String s2 = s;	//Iterated string
		
		//Reverses the string (Except first character)
		for(int i=0;i<length;i++) {
			for(int l=0;l<j;l++) {	//Takes a subsequence of last charachters
				s2 = rest(s2);
			}
			newString = (newString + first(s2));
			s2 = s;		//Resets s2 String
			j--;	//Sets j to pick an earlier character
		}
			
		newString = (newString + first(s));	//Adds first term to String
			
		return(newString);
	}
	
	//Checks if a string is a palendrome, returns a boolean
	public static boolean isPalendrome(String s) {
		
		int length = length(s);		//Initial length
		String initialString = s;	//Storage string
		
		if (length(s) == 1) {
			return true;	
		}
		else if (length(s) == 2 && first(s) == first(rest(s))) {
			return true;
		}
		else {
			for(int i=0;i<length-1;i++) {
				s = rest(s);
			}
			if(first(initialString) == first(s)) {
				isPalendrome(middle(initialString));
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		String s = "Hello there";	//<--- Input string
		
		if (length(s) > 1) {	//Works with two or more characters
			//Tests the methods:
			System.out.println(first(s));
			System.out.println(rest(s));
			System.out.println(middle(s));
			System.out.println(length(s));
		
			System.out.println("---");
			System.out.println("Vertical:");
			printString(s);
		
			System.out.println("---");
			System.out.println("Updside down:");
			printBackward(s);
		
			System.out.println("---");
			System.out.println("Backwards: " + reverseString(s));
			
			System.out.println("---");
			System.out.print("Is palendrome:" + isPalendrome(s));
		
		}
		else {		//Works without two or more characters
			
			System.out.print("Is palendrome: " + isPalendrome(s));
			
		}
	}
}
