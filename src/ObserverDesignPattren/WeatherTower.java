package ObserverDesignPattren;

public class WeatherTower {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        weatherData.registerObserver(new CurrentDisplay());
        weatherData.registerObserver(forecastDisplay);

        weatherData.setMeasurements(20,30,40);
        weatherData.setMeasurements(30,40,50);
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(40,50,60);
    }
}
