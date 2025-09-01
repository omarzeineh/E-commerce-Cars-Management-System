package Group7;

import java.util.ArrayList;

/*
@author Omar Mohammad 1088546
        Mohammad Fares 1088672
        Hadi Albanna 1088677
 */
// SUV class, which extends the abstract car class
public class SUV_G7 extends Car_G7 {

    // Constant field representing the type of vehicle, which is "SUV"
    private static final String type = "SUV";

    // Field specific to the SUV class
    private String Drivetrain_Options;   // Represents the drivetrain options for the SUV (e.g., AWD, FWD, RWD)

    // Constructor for the SUV class to initialize both SUV-specific and inherited car fields
    public SUV_G7(String Drivetrain_Options, String carName, int price,
            ArrayList<String> stockLevels, String engineType,
            ArrayList<String> reviews, int maxSpeed, String yearOfMake,
            int numOfSeats) {
        // Call to the superclass constructor to initialize the car-related fields
        super(carName, price, stockLevels, engineType, reviews, maxSpeed, yearOfMake, numOfSeats);
        // Initializing the SUV-specific field
        this.Drivetrain_Options = Drivetrain_Options;
    }

    // Static method to get the type of the vehicle
    public static String getType() {
        return type;  // Returns "SUV"
    }

    // Getter for the Drivetrain_Options field
    public String getDrivetrain_Options() {
        return Drivetrain_Options;  // Returns the drivetrain options (e.g., AWD, FWD, RWD)
    }

    // Setter for the Drivetrain_Options field
    public void setDrivetrain_Options(String Drivetrain_Options) {
        this.Drivetrain_Options = Drivetrain_Options;  // Updates the drivetrain options
    }

    // Override the toString() method to provide a custom string representation of the SUV object
    @Override
    public String toString() {
        return ("Car Type: SUV"
                + ", Car Name: " + this.getCarName()
                + ", Price: " + this.getPrice()
                + ", Engine Type: " + this.getEngineType()
                + ", Max Speed: " + this.getMaxSpeed()
                + ", Year Of Make: " + this.getYearOfMake()
                + ", Number Of Seats: " + this.getNumOfSeats()
                + "\nStock Levels: " + this.getStockLevels()
                + "\nReviews: " + this.getReviews()
                + "\nDrivetrain Options: " + this.getDrivetrain_Options());
    }
}

