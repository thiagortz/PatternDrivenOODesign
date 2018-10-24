package strategy.solution;

public class DayRate implements Account {
	
	private double value;
	public final static int DAYINMILLIS = 86400000;

	public DayRate(double valueRate) {
		this.value = valueRate;
	}

	@Override
	public double calculate(long period) {
		return value * Math.ceil(period / DAYINMILLIS);
	}

}
