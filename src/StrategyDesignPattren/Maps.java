package StrategyDesignPattren;

public class Maps {
    private String from;
    private String to;

    private Transportation transportation;
    public Maps(String from, String to, Transportation transportation) {
        this.from = from;
        this.to = to;
        this.transportation = transportation;
    }

//    public void Googlemaps(){
//        if(transportation == Transportation.WALK){
//            System.out.println("Walking from " + from + " to " + to+" charging"+km*0);
//        }
//        else if(transportation == Transportation.BIKE){
//            System.out.println("Biking from " + from + " to " + to+" charging"+km*0.5);
//        }
//        else if(transportation == Transportation.CAR){
//            System.out.println("Driving from " + from + " to " + to+" charging"+km*1.0);
//        }
//        else{
//            System.out.println("Trucking from " + from + " to " + to+" charging"+km*2.0);
//        }
//    }

//    This direct way of implementing the Googlemaps method is not recommended as because it is violating
//    the Single Responsibility Principle and also OCP principle as if we want to add a new transportation
//    method then we have to modify the existing code which is not a good practice.
//    so, we are seggregating the code into different classes and implementing the Googlemaps method in the
//    respective classes.

    public void Googlemaps(){
        PathCalculatorFactoryPattren pathCalculatorFactoryPattren = new PathCalculatorFactoryPattren();
        PathCalculatorStrategyPattren pathCalculatorStrategyPattren = pathCalculatorFactoryPattren.getPathCalculator(transportation);
        pathCalculatorStrategyPattren.getPath(from,to);
    }
//    This is the correct way of implementing the Googlemaps method as we are segregating the code into different
//    classes and implementing the Googlemaps method in the respective classes.


}
