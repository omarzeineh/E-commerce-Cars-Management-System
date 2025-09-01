package Group7;

import java.util.ArrayList;

/*
@author Omar Mohammad 1088546
        Mohammad Fares 1088672
        Hadi Albanna 1088677
 */
// Abstract class representing a generic car
public abstract class Car_G7 {

    // Fields representing car details
    private String carName;              // Name of the car
    private int price;                   // Price of the car
    private ArrayList<String> stockLevels; // List of stock levels (can be stores or warehouse levels)
    private String engineType;           // Type of engine (e.g., petrol, diesel, electric)
    private ArrayList<String> reviews;   // List of reviews (customer feedback)
    private int maxSpeed;                // Maximum speed the car can achieve
    private String yearOfMake;           // Year the car was manufactured
    private int numOfSeats;              // Number of seats in the car

    // Constructor to initialize car attributes
    public Car_G7(String carName, int price, ArrayList<String> stockLevels, String engineType,
            ArrayList<String> reviews, int maxSpeed, String yearOfMake, int numOfSeats) {
        this.carName = carName;
        this.price = price;
        this.stockLevels = stockLevels;
        this.engineType = engineType;
        this.reviews = reviews;
        this.maxSpeed = maxSpeed;
        this.yearOfMake = yearOfMake;
        this.numOfSeats = numOfSeats;
    }

    // Getter methods to retrieve the values of car attributes
    public String getCarName() {
        return carName;   // Returns the car name
    }

    public int getPrice() {
        return price;     // Returns the car price
    }

    public ArrayList<String> getStockLevels() {
        return stockLevels;   // Returns the stock levels (list)
    }

    public String getEngineType() {
        return engineType;    // Returns the type of engine
    }

    public ArrayList<String> getReviews() {
        return reviews;       // Returns the list of reviews
    }

    public int getMaxSpeed() {
        return maxSpeed;      // Returns the maximum speed
    }

    public String getYearOfMake() {
        return yearOfMake;    // Returns the year of manufacture
    }

    public int getNumOfSeats() {
        return numOfSeats;    // Returns the number of seats
    }

    // Setter methods to modify the values of car attributes
    public void setCarName(String carName) {
        this.carName = carName;   // Sets the car name
    }

    public void setPrice(int price) {
        this.price = price;       // Sets the car price
    }

    // Adds a stock level to the list of stock levels
    public void addStockLevel(String stockLevel) {
        this.stockLevels.add(stockLevel);
    }

    // Removes a specific stock level from the list
    public void removeStockLevel(String stockLevel) {
        this.stockLevels.remove(stockLevel);
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;   // Sets the engine type
    }

    // Adds a review to the list of reviews
    public void addRev(String review) {
        this.reviews.add(review);
    }

    // Removes a specific review from the list
    public void removeRev(String review) {
        this.reviews.remove(review);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;   // Sets the maximum speed
    }

    public void setYearOfMake(String yearOfMake) {
        this.yearOfMake = yearOfMake;   // Sets the year of manufacture
    }

    // Sets the number of seats 
    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    // Override the default toString method to return the car object as a string
    @Override
    public String toString() {
        return super.toString();
        /* Currently just returning the parent class's toString, should ideally return
                                    relevant car details*/
    }
    

}

