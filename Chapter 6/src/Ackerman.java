
public class Ackerman {

	public static int acker(int m, int n) {
		
		if (m == 0) {
			return(n + 1);
		} else if (m > 0 && n == 0) {
			return(acker(m-1, 1));
		} else if (m > 0 && n > 0){
			return(acker(m-1, n-1));
		}
		
		return(0);
	}
	
	public static void main(String[] args) {
		System.out.println(acker(2, 1));
	}

}
