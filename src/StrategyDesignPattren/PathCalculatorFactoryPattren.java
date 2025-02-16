package StrategyDesignPattren;

public class PathCalculatorFactoryPattren {
    PathCalculatorStrategyPattren pathCalculatorStrategyPattren;
    public PathCalculatorStrategyPattren getPathCalculator(Transportation transportation) {
        if(transportation.equals(Transportation.WALK)) {
            pathCalculatorStrategyPattren = new Walk();
        }
        else if(transportation.equals(Transportation.BIKE)){
            pathCalculatorStrategyPattren = new Bike();
        }
        else if(transportation.equals(Transportation.CAR)){
            pathCalculatorStrategyPattren = new Car();
        }
        else{
            pathCalculatorStrategyPattren = new Truck();
        }
        return pathCalculatorStrategyPattren;
    }
}
