
public class Exercise4 {

	public static void main(String[] args) {	//Finds the factorial of n (n!) without recursion

		int n = 4;
		int i = n;
		
		while (i > 1) {
			n = n * (i-1);
			i--;
		}
		System.out.println(n);
	}

}
