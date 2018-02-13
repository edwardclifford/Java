import java.util.Scanner;

/**
 * Converts seconds to hours, minutes, and seconds.
 * Ted Clifford - 1.16.18
 */
public class Convert {

    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	int seconds;
    	int hours;
    	int minutes;
    	int secondsRemaining;
    	
    	System.out.print("Enter an amount of seconds: ");
    	
    	seconds = in.nextInt();
    	hours = seconds / 3600;
    	minutes = (seconds % 3600) / 60;
    	secondsRemaining = seconds - (hours * 3600) - (minutes * 60);
    	
    	System.out.printf("%d H, %d M, %d S", hours, minutes, secondsRemaining);
    }
}