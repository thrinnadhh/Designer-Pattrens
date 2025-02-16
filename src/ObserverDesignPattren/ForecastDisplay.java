package ObserverDesignPattren;

public class ForecastDisplay implements Observer,Display{

    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void display() {
        if(temperature>30){
            System.out.println("Forecast: Hot");
        }
        if(humidity>30 && temperature<20){
            System.out.println("Forecast: Rainy");
        }
        if(pressure>30){
            System.out.println("Forecast: Windy");
        }

    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }
}
