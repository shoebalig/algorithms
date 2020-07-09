package design.patters.observer;

public class ObserverRain implements Observer{
	private String couldRain;
	private ConcreteSubject subject;
	
	void updateRain(String couldRain)
	{
		this.couldRain= couldRain;
		displayRainForecasting();
	}
	void displayRainForecasting()
	{
		System.out.println("Rain forecasting :- "+couldRain);
	}
	@Override
	public void undate(ConcreteSubject concreteSubject) {
		updateRain(concreteSubject.rainForecasting);
	}
	public ObserverRain(ConcreteSubject subject) {
		this.subject = subject;
		subject.subscribe(this);
		
	}
}
