import java.util.ArrayList;

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public ArrayList<String> getDescription() {
		ArrayList<String> s = new ArrayList(beverage.getDescription());
		s.add("Mocha");
		return s;
	}

	public double cost() {
		return .20 + beverage.cost();
	}
}
