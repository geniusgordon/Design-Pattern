import java.util.ArrayList;

public abstract class Beverage {
	String description = "Unknown Beverage";

	public ArrayList<String> getDescription() {
		ArrayList<String> s = new ArrayList();
		s.add(description);
		return s;
	}
	
	abstract public double cost();
}
