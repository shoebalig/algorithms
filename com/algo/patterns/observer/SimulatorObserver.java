package design.patters.observer;

public class SimulatorObserver {

	public static void main(String[] args) {
		ConcreteSubject sub =  new ConcreteSubject();
		
		ObserverTemprature obserTemp= new ObserverTemprature(sub);
		ObserverHumidity obserHumidity= new ObserverHumidity(sub);
		ObserverRain obserRain= new ObserverRain(sub);
		sub.setMeasurements(10, 11, "Thuderstorm might rain");
		sub.setMeasurements(20, 30, "Mostly Sunny, no rain");
			
		sub.unsubscribe(obserRain);
		sub.setMeasurements(1, 22, "unsubscribe");
	}
}
