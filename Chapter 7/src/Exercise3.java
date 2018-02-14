
public class Exercise3 {

	public static void main(String[] args) {	//Finds x^n using iteration, checks with Math.pow()
		// TODO Auto-generated method stub
		int x = 4;
		int n = 5;
		
		while (n > 1) {
			x = x * x;
			n--;
		}

		System.out.println(x);
		System.out.println((int)Math.pow(x, n));
	}

}
