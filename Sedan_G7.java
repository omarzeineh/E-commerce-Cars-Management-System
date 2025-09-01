package Group7;

import java.util.ArrayList;

/*
@author Mohammad Fares 1088672
        Omar Mohammad 1088546
        Hadi Albanna 1088677
 */
// Sedan class, which extends the abstract car class
public class Sedan_G7 extends Car_G7 {

    // Constant field representing the type of vehicle, which is "Sedan"
    private static final String type = "Sedan";

    // Fields specific to the Sedan class
    private boolean Sport;    // Indicates whether the sedan is a sport version
    private boolean Luxury;   // Indicates whether the sedan is a luxury model

    // Constructor for the Sedan class to initialize both sedan-specific and inherited car fields
    public Sedan_G7(boolean Sport, boolean Luxury, String carName, int price,
            ArrayList<String> stockLevels, String engineType,
            ArrayList<String> reviews, int maxSpeed, String yearOfMake,
            int numOfSeats) {
        // Call to the superclass constructor to initialize the car-related fields
        super(carName, price, stockLevels, engineType, reviews, maxSpeed, yearOfMake, numOfSeats);
        // Initializing the sedan-specific fields
        this.Sport = Sport;
        this.Luxury = Luxury;
    }

    // Static method to get the type of the vehicle
    public static String getType() {
        return type;  // Returns "Sedan"
    }

    // Getter for the Sport field
    public boolean isSport() {
        return Sport;  // Returns true if the sedan is a sport model, false otherwise
    }

    // Setter for the Sport field
    public void setSport(boolean Sport) {
        this.Sport = Sport;  // Sets whether the sedan is a sport model
    }

    // Getter for the Luxury field
    public boolean getLuxury() {
        return Luxury;  // Returns true if the sedan is a luxury model, false otherwise
    }

    // Setter for the Luxury field
    public void setLuxury(boolean Luxury) {
        this.Luxury = Luxury;  // Sets whether the sedan is a luxury model
    }

    // Override the toString() method to provide a custom string representation of the Sedan object
    @Override
    public String toString() {
        return ("Car Type: Sedan"
                + ", Car Name: " + this.getCarName()
                + ", Price: " + this.getPrice()
                + ", Engine Type: " + this.getEngineType()
                + ", Max Speed: " + this.getMaxSpeed()
                + ", Year Of Make: " + this.getYearOfMake()
                + ", Number Of Seats: " + this.getNumOfSeats()
                + "\nStock Levels: " + this.getStockLevels()
                + "\nReviews: " + this.getReviews()
                + ", Is it a Sport car? " + this.isSport()
                + ", Is it Luxury? " + this.getLuxury());
    }
}
