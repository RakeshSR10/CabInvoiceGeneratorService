package com.cabInvoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    //Step 1 Calculate Fare using given Distance and Time.
    //Test 1
    @Test
    public void givenDistanceAndTime_ShouldReturnFare(){
        InvoiceGenerator invoiceGenerator =  new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, fare,0.0);
        System.out.println(fare);
    }

    //Test 2 Calculate Fare with minimum fare 5.0
    @Test
    public void givenDistanceAndTime_ShouldReturnMinimumFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(5, fare,0.0);
        System.out.println(fare);
    }

    //Step 2 Multiple Rides
    //Test 3 CalculateFare for multiple Rides
    /*@Test
    public void givenMultipleRides_ShouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5),
                        new Ride(0.1,1)};
        double fare = invoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(30,fare,0.0);
        System.out.println(fare);
    }*/

    //Step 3 Enhanced Invoice
    //Test 4 TotalNumber of Rides, TotalFare, AverageFare per Ride
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5),
                        new Ride(0.1,1)};
        InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary =  new InvoiceSummary(2,30.0);
        Assertions.assertEquals(expectedInvoiceSummary, summary);
    }
}
