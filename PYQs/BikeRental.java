/*
Problem Statement:
Write a Java program to simulate a Bike Rental System.

Requirements:
- Create a Bike class with attributes:
  model (String), ratePerHour (float), isAvailable (boolean)
- Method rentBike(int hours):
  - Calculate cost = hours * ratePerHour
  - If hours > 5, apply 10% discount
  - Display final cost and mark bike unavailable
  - If unavailable, display appropriate message
- In main():
  - Create two Bike objects using no-arg constructor
  - Rent first bike for 4 hours
  - Try renting same bike again (should be unavailable)
  - Rent second bike for 6 hours (discount applied)
*/

class Bike {
    String model;
    float ratePerHour;
    boolean isAvailable;

    void rentBike(int hours) {
        if (isAvailable) {
            float cost = hours * ratePerHour;

            // Apply discount if hours > 5
            if (hours > 5) {
                cost -= cost * 0.10f;
            }

            System.out.println("Bike Model: " + model);
            System.out.println("Hours: " + hours);
            System.out.println("Final Cost: " + cost);

            // Mark bike unavailable
            isAvailable = false;
        } else {
            System.out.println("Bike " + model + " is not available.");
        }
    }
}

public class BikeRental {
    public static void main(String[] args) {

        Bike b1 = new Bike();
        b1.model = "Yamaha";
        b1.ratePerHour = 100;
        b1.isAvailable = true;

        Bike b2 = new Bike();
        b2.model = "Honda";
        b2.ratePerHour = 120;
        b2.isAvailable = true;

        b1.rentBike(4);   // Successful rental
        b1.rentBike(2);   // Not available
        b2.rentBike(6);   // Discount applied
    }
}
