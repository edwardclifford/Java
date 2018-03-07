/**
*First, the program creates an array that counts from 1 to n-1, where n is the amount of objects in the array.
*Then, the method dub multiplies each of the objects in the array by 2, assigning the new values to the array bob.
*Mus finds the sum of all the objects in an array, and the program prints these results
*/

class Exercise3 {
	public static int[] make(int n) {
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	        a[i] = i + 1;
	    }
	    return a;
	}
	public static void dub(int[] jub) {
	    for (int i = 0; i < jub.length; i++) {
	        jub[i] *= 2;
	    }
	}
	public static int mus(int[] zoo) {
	    int fus = 0;
	    for (int i = 0; i < zoo.length; i++) {
	        fus += zoo[i];
	    }
	    return fus;
	}
	public static void main(String[] args) {
	    int[] bob = make(5);
	    dub(bob);
	    System.out.println(mus(bob));
	}
}