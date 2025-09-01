package Group7;

import java.util.ArrayList;

/*
@author Omar Mohammad 1088546
        Mohammad Fares 1088672
        Hadi Albanna 1088677
 */
// Truck class, which extends the abstract car class
public class Truck_G7 extends Car_G7 {

    // Constant field representing the type of vehicle, which is "Truck"
    private static final String type = "Truck";

    // Fields specific to the Truck class
    private double truckWeight;      // Weight of the truck
    private double loadCapacity;     // Maximum load capacity of the truck

    // Constructor for Truck class that initializes both truck-specific and inherited car fields
    public Truck_G7(double truckWeight, double loadCapacity, String carName, int price,
            ArrayList<String> stockLevels, String engineType, ArrayList<String> reviews,
            int maxSpeed, String yearOfMake, int numOfSeats) {
        // Call to the superclass constructor to initialize the car-related fields
        super(carName, price, stockLevels, engineType, reviews, maxSpeed, yearOfMake, numOfSeats);
        // Initializing the truck-specific fields
        this.truckWeight = truckWeight;
        this.loadCapacity = loadCapacity;
    }

    // Static method to return the type of the vehicle
    public static String getType() {
        return type;  // Returns "Truck"
    }

    // Getter for truck weight
    public double getTruckWeight() {
        return truckWeight;  // Returns the weight of the truck
    }

    // Setter for truck weight
    public void setTruckWeight(double truckWeight) {
        this.truckWeight = truckWeight;  // Updates the truck's weight
    }

    // Getter for load capacity
    public double getLoadCapacity() {
        return loadCapacity;  // Returns the load capacity of the truck
    }

    // Setter for load capacity
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;  // Updates the load capacity of the truck
    }

    // Override the toString() method to provide a custom string representation of the Truck object
    @Override
    public String toString() {
        return ("Car Type: Truck"
                + ", Car Name: " + this.getCarName()
                + ", Price: " + this.getPrice()
                + ", Engine Type: " + this.getEngineType()
                + ", Max Speed: " + this.getMaxSpeed()
                + ", Year Of Make: " + this.getYearOfMake()
                + ", Number Of Seats: " + this.getNumOfSeats()
                + "\nStock Levels: " + this.getStockLevels()
                + "\nReviews: " + this.getReviews()
                + "\nTruck Weight: " + this.getTruckWeight()
                + "\nLoad Capacity: " + this.getLoadCapacity());
    }
}

