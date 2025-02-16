package StrategyDesignPattren;

public class Car implements PathCalculatorStrategyPattren{
    @Override
    public void getPath(String from, String to) {
        System.out.println("Driving from " + from + " to " + to);
    }
}
