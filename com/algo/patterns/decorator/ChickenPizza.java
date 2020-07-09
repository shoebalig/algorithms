package design.patters.decorator;

public class ChickenPizza implements Pizza{

	@Override
	public String getDescription() {
		return "Chicken Pizza";
	}

	@Override
	public int getCost() {
		return 150;
	}
}
