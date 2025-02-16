package ObserverDesignPattren;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private double temperature;
    private double humidity;
    private double pressure;
    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }


    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            System.out.println("Updating the observer "+observer);
            observer.update(temperature, humidity, pressure);
        }
    }
    public void setMeasurements(double temperature,double humidity,double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
