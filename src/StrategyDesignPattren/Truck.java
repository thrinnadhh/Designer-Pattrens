package StrategyDesignPattren;

public class Truck implements PathCalculatorStrategyPattren {
    @Override
    public void getPath(String from, String to) {
        System.out.println("Trucking from " + from + " to " + to+" charging");
    }
}
