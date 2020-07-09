package design.patters.decorator;

public class PineAppleTopingDecorator implements TopingDecorator{

	private Pizza pizza;
	
	public PineAppleTopingDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return "Toping with PineApple";
	}

	@Override
	public int getCost() {
		return pizza.getCost()+40;
	}

}
