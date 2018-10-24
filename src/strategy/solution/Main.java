package strategy.solution;

import strategy.problem.Ride;

public class Main {

	public static void main(String[] args) {
		
		double hourRate = 2.0;
		double dayRate = 26.0;

		var parking = new Parking(new Ride());
		parking.setAccount(new HourRate(hourRate));

		System.out.printf("Total Hour Rate: %f", parking.accountValue());
		
		parking.setAccount(new DayRate(dayRate));
		System.out.println();
		System.out.printf("Total Day Rate: %f", parking.accountValue());
		
	}

}
