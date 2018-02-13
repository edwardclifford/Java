
public class Five {

	public static void main(String[] args) {
		song(99);
		
	}
	
	
	public static void song(int bottles) {
		if (bottles > 0) {
			lyrics(bottles);
			song(bottles - 1);
		} else
			lastLyrics();
	}
	
	
	public static void lyrics(int bottles) {
		System.out.println(bottles + " bottles of beer  on the wall,");
		System.out.println(bottles + " bottles of beer,");
		System.out.println("ya' take one down, ya' pass it around,");
		System.out.println(bottles + " bottles of beer on the wall.");
		System.out.println();
	}
	
	
	public static void lastLyrics() {
		System.out.println("No bottles of beer  on the wall,");
		System.out.println("no bottles of beer,");
		System.out.println("ya' can't take one down, ya' can't pass it around,");
		System.out.println("'cause there are no bottles of beer on the wall!");
	}

}
