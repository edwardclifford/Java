
public class Exercise6 {

	/*
	 * Having trouble getting this code to execute. it compiles, but will not spit anything out.
	 * I also can't figure out how to solve this according to how it is asked, without the seperate methods, that is.
	 * 
	 */
	
	public static double power(double x, int n) {
		
		while (n > 1) {
			x = x * x;
			n--;
		}
		
		return(x);
	}
	
	public static double iterate(int n) {	//Returns the factorial of n
		
		int i = n;
		
		while (i > 1) {
			n = n * (i-1);
			i--;
		}
		return(n);
	}
	
	public static double gauss(double x, int n) {
		
		int i = 0;
		double a = 0;
		
		while (i < n) {
			
			a =+ power(-1, i) * power(x, 2*i) / iterate(i);
				
		}
		
		return(a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2;
		int n = 1;
		System.out.println(gauss(x, n));
		System.out.println(Math.exp(-Math.pow(x, n)));
	}

}
