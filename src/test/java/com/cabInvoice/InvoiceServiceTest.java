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
        Assertions.assertEquals(5, fare);
        System.out.println(fare);
    }
}
