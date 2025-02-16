package RideSharingApp;


public class PricingManager {

    private static final double BASE_FARE = 5.0; // Base fare amount
    private static final double PER_KILOMETER_RATE = 2.0; // Rate per kilometer
    private static final double PER_MINUTE_RATE = 0.5; // Rate per minute
    private static final double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier

    private PricingType pricingType;

    public PricingManager(PricingType pricingType) {
        this.pricingType = pricingType;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        switch (pricingType) {
            case DISTANCE_BASED:
                return BASE_FARE + PER_KILOMETER_RATE * rideDetails.getDistance();
            case TIME_BASED:
                return BASE_FARE + PER_MINUTE_RATE * rideDetails.getDuration();
            case SURGE:
                return BASE_FARE * SURGE_MULTIPLIER;
        }
        throw new IllegalArgumentException("Invalid pricing type");
    }

}