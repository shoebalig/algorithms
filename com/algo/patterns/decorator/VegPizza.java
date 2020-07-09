package design.patters.decorator;

public class VegPizza implements Pizza{

	@Override
	public String getDescription() {
		return "Veg Pizza";
	}

	@Override
	public int getCost() {
		return 100;
	}
}
