package strategy.solution;

public class HourRate implements Account {
	private double value;
	public final static int HOURINMILLIS = 3600000;

	public HourRate(double valueRate) {
		this.value = valueRate;
		
	}

	@Override
	public double calculate(long period) {
		return value * Math.ceil(period / HOURINMILLIS);
	}

}
