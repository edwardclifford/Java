
public class Exercise5 {

	//Checks to see if a string is "Abecedarian" (does not work with capitals)
	public static boolean isAbecerdian(String s) {
		
		char last = ' ';
		
		for(int i=0;i<=s.length()-1;i++) {
			if (i == 0) {
				last = s.charAt(i);

			}
			else {

				if ((int)s.charAt(i) > (int)last) {
				
				}
				else {
					return false;
				}
			}
			
		}
		return(true);
	}
	
	public static void main(String[] args) {
		System.out.println(isAbecerdian("acorsy"));

	}

}
