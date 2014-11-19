public class NYPizzaStore extends PizzaStore {
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYCheesePizza();
		}
		return null;
	}
}
