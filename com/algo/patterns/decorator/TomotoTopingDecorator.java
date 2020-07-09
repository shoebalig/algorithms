package design.patters.decorator;

public class TomotoTopingDecorator implements TopingDecorator{

	Pizza pizza;
	public TomotoTopingDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return "Toping with tomato";
	}

	@Override
	public int getCost() {
		return pizza.getCost()+20;
	}
}
