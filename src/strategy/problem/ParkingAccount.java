package strategy.problem;

public class ParkingAccount {
	
	private Vehicle vehicle;
	private long start, finish;
	
	public double accountValue() {
		long current = finish == 0 ? System.currentTimeMillis() : finish;
		long period = start - current;
		
		if(vehicle instanceof Ride) {
			if (period < 12) {
				return 2.0 * Math.ceil(period / 3600000);
			} else {
				return 26.0 * Math.ceil(period/ 86400000);
			}
		}
		// other rules for different types of vehicles
		
		return 0.0;
	}
	

}
