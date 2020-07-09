package design.patters.decorator;

public class OliveTopingDecorator implements TopingDecorator{
	private Pizza pizza;

	public OliveTopingDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return "Toping with Olive";
	}

	@Override
	public int getCost() {
		return pizza.getCost()+30;
	}
}
