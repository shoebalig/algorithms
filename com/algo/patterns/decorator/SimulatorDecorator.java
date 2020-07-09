package design.patters.decorator;

public class SimulatorDecorator {

	public static void main(String[] args) {
		Pizza vegPizza =  new VegPizza();
		Pizza chickenPizza =  new ChickenPizza();
		vegPizza =  new PineAppleTopingDecorator(vegPizza);
		System.out.println(vegPizza.getCost());
		chickenPizza =  new PineAppleTopingDecorator(chickenPizza);
		chickenPizza =  new OliveTopingDecorator(chickenPizza);
		System.out.println(chickenPizza.getCost());
	}
}
