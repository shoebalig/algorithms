package design.patters.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
	int temprature;
	int humidity;
	String rainForecasting;
	List<Observer> observerList= new ArrayList<>();
	@Override
	public void subscribe(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		if(observerList.contains(observer))
			observerList.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observerList) 
		{
			observer.undate(this);
		}
	}
	
	public void setMeasurements(int temprature, int humidity, String rainForecasting)
	{
		this.temprature= temprature;
		this.humidity= humidity;
		this.rainForecasting= rainForecasting;
		notifyObserver();
	}
	public int getTempValue() {
		return this.temprature;
	}
	
	public int getHumidValue() {
		return this.humidity;
	}
	public String getRainForeCasting() {
		return this.rainForecasting;
	}
}
