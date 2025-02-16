package StrategyDesignPattren;

public class Walk implements  PathCalculatorStrategyPattren{
    @Override
    public void getPath(String from, String to) {
        System.out.println("Walking from " + from + " to " + to);
    }
}
