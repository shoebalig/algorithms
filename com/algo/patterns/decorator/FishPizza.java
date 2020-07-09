package design.patters.decorator;

public class FishPizza implements Pizza{

	@Override
	public String getDescription() {
		return "Fish Pizza";
	}

	@Override
	public int getCost() {
		return 180;
	}
}
