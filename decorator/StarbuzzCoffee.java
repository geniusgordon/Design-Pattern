public class StarbuzzCoffee {
	public static void main(String args[]) {
		Beverage beverage2 = new Mocha(new Mocha(new HouseBlend()));
		CondimentPrettyPrinter.print(beverage2);
	}
}
