
public class Time {

	public static void main(String[] args) {
		int hour = 15;
		int minute = 37;
		int second = 45;
		int midnight = (hour*3600) + (minute*60) + second;
		int timeToMidnight = (24*3600) - midnight;
		//This will probably output some cool stuff... if it works
		System.out.println(midnight + " seconds since midnight");
		System.out.println(timeToMidnight + " seconds to midnight");
		System.out.println((midnight / (24.0*3600.0))*100 + "% of the way through the day");
	}

}
