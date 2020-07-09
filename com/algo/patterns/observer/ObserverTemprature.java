package design.patters.observer;

public class ObserverTemprature implements Observer{
	int temprature;
	private ConcreteSubject subject;
	void updateTemprature(int temprature)
	{
		this.temprature= temprature;
		displayTemprature();
	}
	public ObserverTemprature(ConcreteSubject subject) {
		this.subject = subject;
		subject.subscribe(this);
		
	}
	void displayTemprature()
	{
		System.out.println("Today Temprature is :- "+temprature);
	}
	@Override
	public void undate(ConcreteSubject concreteSubject) {
		updateTemprature(concreteSubject.temprature);		
	}
}
