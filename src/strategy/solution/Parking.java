package strategy.solution;

import strategy.problem.Vehicle;

public class Parking {

	private Account account;
	private long start, finish;
	private Vehicle vehicle;

	public Parking(Vehicle vehicle) {
		this.start = System.currentTimeMillis();
		this.vehicle = vehicle;
	}

	public double accountValue() {
		this.finish = System.currentTimeMillis();
		return account.calculate(finish - start);
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	

}