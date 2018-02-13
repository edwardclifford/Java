
public class Recursion {
	
	public static void blastOff(int x) {
		if (x == 0)
			System.out.println("Blastoff!");
		else {
			System.out.println(x);
			blastOff(x-1);
		}
	}
	
	
	public static void main(String[] args) {
		int countdown = 10;
		blastOff(countdown);
	}
}
