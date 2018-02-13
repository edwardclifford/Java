
public class Seven {
	
	public static int oddSum(int n) {
		
		if (!(n % 2 == 0)) {
			if (n == 1)
				return(n);
			else
				return(n + oddSum(n - 2));
		} else 
			System.out.println("Supposed to be odd");
		return(0);
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.print(oddSum(12));
		
	}
}
