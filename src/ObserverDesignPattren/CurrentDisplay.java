package ObserverDesignPattren;

public class CurrentDisplay implements Observer,Display{
    private double humidity;
    private double temperature;
    private double pressure;

    @Override
    public void display() {
        System.out.println("Current Temperature: "+temperature);
        System.out.println("Current Humidity: "+humidity);
        System.out.println("Current Pressure: "+pressure);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
