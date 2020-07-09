package design.patters.observer;

public class ObserverHumidity implements Observer{

	private int humidity;
	private Subject subject;
	void updateHumidity(int humidity)
	{
		this.humidity= humidity;
		displayHumidity();
	}
	void displayHumidity()
	{
		System.out.println("Today Humidity is :- "+humidity);
	}
	@Override
	public void undate(ConcreteSubject concreteSubject) {
		updateHumidity(concreteSubject.humidity);
		
	}
	public ObserverHumidity(Subject subject) {
		this.subject = subject;
		subject.subscribe(this);
	}
}
