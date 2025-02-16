package StrategyDesignPattren;

public class Bike implements PathCalculatorStrategyPattren{
    @Override
    public void getPath(String from, String to) {
        System.out.println("Biking from " + from + " to " + to+" charging");
    }

}
