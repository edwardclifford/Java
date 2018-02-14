
public class Exercise5 {

	public static void check(double x, int n) {
		
		System.out.println((double)x + "\t" + myexp(x, n) + "\t" + Math.exp(x));
		
	}
	
	public static double iterate(int n) {	//Returns the factorial of n
		
		int i = n;
		
		while (i > 1) {
			n = n * (i-1);
			i--;
		}
		return(n);
	}
	
	public static double myexp(double x, double n) {	//Estimates e^x, and the higher n is, the more exact the estimation
		
		int i = 1;
		double y = 0;
		
		while (i <= n) {
			//Need help making this more efficient (part 2)
			y = y + Math.pow(x, i)/iterate(i);
			i++;
		}
		
		return(y + 1);
	}
	
	public static void main(String[] args) {
	
		int x = 1; //Exponent of e
		int n = 10; //Level of estimation (do not exceed 15)
		
		System.out.println(myexp(x, n));
		System.out.println();
		
		double z = .1;
		
		//Print results as x increases on a magnitude of 10... As value increases, the estimate is father off
		for(int i=0;i<4;i++) {	
			
			check(z, n);
			z = z * 10;
		}
		
		System.out.println();
		
		z = -.1;
		for(int i=0;i<4;i++) {
			
			check(z, n);
			z = z * 10;
		}

	}

}
