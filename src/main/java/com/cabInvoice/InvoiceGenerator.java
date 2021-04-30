package com.cabInvoice;

public class InvoiceGenerator {
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final double MINIMUM_FARE = 5;

    //Step 1
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;// totalFare = 2.0*10+1*5

        // return totalFare;
        if(totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }
    //Step 2
    public double calculateFare(Ride[] rides){
        double totalFare = 0;
        for(Ride ride:rides){
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}
