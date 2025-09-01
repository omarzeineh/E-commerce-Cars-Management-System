package Group7;

import java.util.ArrayList;

/*
@author Omar Mohammad 1088546
        Mohammad Fares 1088672
        Hadi Albanna 1088677
 */
// Interface Manager which defines methods to manage car objects (CRUD operations)
interface Manager_G7{

    // Adds a new car to the system
    void addCar(Car_G7 car);

    // Updates the name of the car identified by carName
    void updateName(String carName, String name);

    // Updates the price of the car identified by carName
    void updatePrice(String carName, int price);

    // Updates the engine type of the car identified by carName
    void updateEngineType(String carName, String engineType);

    // Updates the maximum speed of the car identified by carName
    void updateMaxSpeed(String carName, int maxSpeed);

    // Updates the year of make for the car identified by carName
    void updateYearOfMake(String carName, String yearOfMake);

    // Updates the number of seats of the car identified by carName
    void updateNumOfSeats(String carName, int numOfSeats);

    // Adds a review for the car identified by carName
    void addReview(String carName, String review);

    // Removes a review for the car identified by carName
    void removeReview(String carName, String review);

    // Adds a stock level to the car identified by carName
    void addStock(String carName, String stockLevel);

    // Removes a stock level from the car identified by carName
    void removeStock(String carName, String stockLevel);

    // Specific to trucks: Adds the truck weight for the truck identified by carName
    void updateTruckWeight(String carName, double truckWeight);

    // Specific to trucks: Adds the load capacity for the truck identified by carName
    void updateLoadCapacity(String carName, double loadCapacity);

    // Specific to sedans: Marks the sedan as a sport model for the car identified by carName
    void updateSport(String carName, boolean Sport);

    // Specific to sedans: Marks the sedan as a luxury model for the car identified by carName
    void updateLuxury(String carName, boolean Luxury);

    // Specific to SUVs: Sets the drivetrain options for the SUV identified by carName
    void updateDrivetrainOptions(String carName, String Drivetrain_Options);

    // Adds cars from a file (e.g., a CSV or JSON file), for bulk addition of cars
    void addFromFile(String filePath);

    // Retrieves a list of all cars managed by the system
    ArrayList<Car_G7> getAllCars();

    // Retrieves a list of all SUVs managed by the system
    ArrayList<Car_G7> getSUVs();

    // Retrieves a list of all Sedans managed by the system
    ArrayList<Car_G7> getSedans();

    // Retrieves a list of all Trucks managed by the system
    ArrayList<Car_G7> getTrucks();

    // Calculates and returns the total price of all SUVs
    int priceOfSUVs();

    // Calculates and returns the total price of all Sedans
    int priceOfSedans();

    // Calculates and returns the total price of all Trucks
    int priceOfTrucks();
}

