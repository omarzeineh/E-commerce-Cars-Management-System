package Group7;

import hw1.car;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@author Omar Mohammad 1088546 
        Mohammad Fares 1088672
        Hadi Albanna 1088677
 */
// CarsManager class implements Manager interface to manage a collection of Car objects
public class CarsManager_G7 implements Manager_G7 {

    private ArrayList<Car_G7> cars; // List to hold all the car objects

    // Constructor initializes the cars list
    public CarsManager_G7() {
        this.cars = new ArrayList<>();
    }

    // Method to add a new car to the collection
    @Override
    public void addCar(Car_G7 car) {
        cars.add(car); // Adds the given car to the list of cars
    }

    // Method to update the name of a specific car identified by carName
    @Override
    public void updateName(String carName, String name) {
        // Loop through the list of cars to find the car with the matching name
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                this.cars.get(i).setCarName(name); // Update the car's name
            }
        }
    }

    // Method to update the price of a specific car identified by carName
    @Override
    public void updatePrice(String carName, int price) {
        // Loop through the list of cars to find the car with the matching name
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                this.cars.get(i).setPrice(price); // Update the car's price
            }
        }
    }

    // Method to update the engine type of a specific car identified by carName
    @Override
    public void updateEngineType(String carName, String engineType) {
        // Loop through the list of cars to find the car with the matching name
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                this.cars.get(i).setEngineType(engineType); // Update the engine type
            }
        }
    }

    // Method to update the maximum speed of a specific car identified by carName
    @Override
    public void updateMaxSpeed(String carName, int maxSpeed) {
        // Loop through the list of cars to find the car with the matching name
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                this.cars.get(i).setMaxSpeed(maxSpeed); // Update the maximum speed
            }
        }
    }

    // Method to update the year of manufacture of a specific car identified by carName
    @Override
    public void updateYearOfMake(String carName, String yearOfMake) {
        // Loop through the list of cars to find the car with the matching name
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                this.cars.get(i).setYearOfMake(yearOfMake); // Update the year of manufacture
            }
        }
    }

    // Method to update the number of seats in a specific car identified by carName
    @Override
    public void updateNumOfSeats(String carName, int numOfSeats) {
        // Loop through the list of cars to find the car with the matching name
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                this.cars.get(i).setNumOfSeats(numOfSeats); // Update the number of seats
            }
        }
    }

    // Method to add a review to a specific car identified by carName
    @Override
    public void addReview(String carName, String review) {
        // Loop through the list of cars to find the car with the matching name
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                this.cars.get(i).addRev(review); // Add the review to the car's list of reviews
            }
        }
    }

    // Method to remove a review from a specific car identified by carName
    @Override
    public void removeReview(String carName, String review) {
        // Loop through the list of cars to find the car with the matching name
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                this.cars.get(i).removeRev(review); // Remove the specified review from the car's list of reviews
            }
        }
    }

    // Method to add stock level for a specific car identified by carName
    @Override
    public void addStock(String carName, String stockLevel) {
        // Loop through the list of cars to find the car with the matching name
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                this.cars.get(i).addStockLevel(stockLevel); // Add stock level to the car's inventory
            }
        }
    }

    // Method to remove stock level for a specific car identified by carName
    @Override
    public void removeStock(String carName, String stockLevel) {
        // Loop through the list of cars to find the car with the matching name
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                this.cars.get(i).removeStockLevel(stockLevel); // Remove stock level from the car's inventory
            }
        }
    }

    // Method to add truck weight for a specific car identified by carName
    @Override
    public void updateTruckWeight(String carName, double truckWeight) {
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                if(this.cars.get(i) instanceof Truck_G7) {
                Truck_G7 truck = (Truck_G7)this.cars.get(i);
                truck.setTruckWeight(truckWeight);// Update the number of seats
                }
                else{
                    System.out.println("This car is not a truck");
                }
            }
        }
    }

    // Method to add load capacity for a specific car identified by carName
    @Override
    public void updateLoadCapacity(String carName, double loadCapacity) {
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                if(this.cars.get(i) instanceof Truck_G7) {
                Truck_G7 truck = (Truck_G7)this.cars.get(i);
                truck.setLoadCapacity(loadCapacity);// Update the number of seats
                }
                else{
                    System.out.println("This car is not a truck");
                }
            }
        }
    }

    // Method to add sport feature for a specific car identified by carName
    @Override
    public void updateSport(String carName, boolean sport) {
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                if(this.cars.get(i) instanceof Sedan_G7) {
                Sedan_G7 truck = (Sedan_G7)this.cars.get(i);
                truck.setSport(sport);// Update the number of seats
                }
                else{
                    System.out.println("This car is not a sedan");
                }
            }
        }
    }

    // Method to add luxury feature for a specific car identified by carName
    @Override
    public void updateLuxury(String carName, boolean luxury) {
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                if(this.cars.get(i) instanceof Sedan_G7) {
                Sedan_G7 truck = (Sedan_G7)this.cars.get(i);
                truck.setLuxury(luxury);// Update the number of seats
                }
                else{
                    System.out.println("This car is not a sedan");
                }
            }
        }
    }

    // Method to add drivetrain options for a specific car identified by carName
    @Override
    public void updateDrivetrainOptions(String carName, String drivetrainOptions) {
        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i).getCarName().equals(carName)) {
                if(this.cars.get(i) instanceof SUV_G7) {
                SUV_G7 truck = (SUV_G7)this.cars.get(i);
                truck.setDrivetrain_Options(drivetrainOptions);// Update the number of seats
                }
                else{
                    System.out.println("This car is not a SUV");
                }
            }
        }
    }
    

    @Override
public void addFromFile(String filePath) {
    try {
        File file = new File(filePath); // Create a File object from the file path
        Scanner input = new Scanner(file); // Scanner for reading the file

        // Loop to read each car's data from the file
        while (input.hasNextLine()) {
            String type = input.next(); // Read car type (SUV, Sedan, Truck)
            input.nextLine(); // Move to the next line
            
            // Read car details
            String carName = input.nextLine(); // Read car name
            int price = Integer.parseInt(input.nextLine()); // Read car price
            String engineType = input.nextLine(); // Read engine type
            int maxSpeed = Integer.parseInt(input.nextLine()); // Read maximum speed
            String yearOfMake = input.nextLine(); // Read year of manufacture
            int numOfSeats = Integer.parseInt(input.nextLine()); // Read number of seats
            
            // Read the stock levels from the next line
            String stocksLine = input.nextLine(); 
            List<String> stockLevels = List.of(stocksLine.split(", ")); // Split stock levels into a list

            // Read the reviews from the next line
            String reviewsLine = input.nextLine();
            List<String> reviews = List.of(reviewsLine.split(", ")); // Split reviews into a list

            // Create car based on type
            switch (type) {
                case "SUV":
                    String drivetrainOptions = input.nextLine(); // Read drivetrain options for SUV
                    createSUV(drivetrainOptions, carName, price, stockLevels, engineType, reviews, maxSpeed, yearOfMake, numOfSeats);
                    break;
                case "Sedan":
                    boolean sport = Boolean.parseBoolean(input.nextLine()); // Read sport status
                    boolean luxury = Boolean.parseBoolean(input.nextLine()); // Read luxury status
                    createSedan(sport, luxury, carName, price, stockLevels, engineType, reviews, maxSpeed, yearOfMake, numOfSeats);
                    break;
                case "Truck":
                    double truckWeight = Double.parseDouble(input.nextLine()); // Read truck weight
                    double loadCapacity = Double.parseDouble(input.nextLine()); // Read load capacity
                    createTruck(truckWeight, loadCapacity, carName, price, stockLevels, engineType, reviews, maxSpeed, yearOfMake, numOfSeats);
                    break;
                default:
                    System.out.println("Unknown car type: " + type); // Handle unknown car types
            }
        }
        input.close(); // Close the scanner
        System.out.println("File Read Successfully"); // Indicate successful reading of the file
    } catch (FileNotFoundException ex) {
        System.out.println("Please enter a file that exists, and make sure that it is in the project directory"); // Handle file not found exception
    } catch (Exception e) {
        System.out.println("Error reading file: " + e.getMessage());
    }
}


    // Helper method to create an SUV object and add it to the collection
    private void createSUV(String drivetrainOptions, String carName, int price, List<String> stockLevels, String engineType, List<String> reviews, int maxSpeed, String yearOfMake, int numOfSeats) {
        this.addCar(new SUV_G7(drivetrainOptions, carName, price, new ArrayList<>(stockLevels), engineType, new ArrayList<>(reviews), maxSpeed, yearOfMake, numOfSeats));
    }

    // Helper method to create a Sedan object and add it to the collection
    private void createSedan(boolean sport, boolean luxury, String carName, int price, List<String> stockLevels, String engineType, List<String> reviews, int maxSpeed, String yearOfMake, int numOfSeats) {
        this.addCar(new Sedan_G7(sport, luxury, carName, price, new ArrayList<>(stockLevels), engineType, new ArrayList<>(reviews), maxSpeed, yearOfMake, numOfSeats));
    }

    // Helper method to create a Truck object and add it to the collection
    private void createTruck(double truckWeight, double loadCapacity, String carName, int price, List<String> stockLevels, String engineType, List<String> reviews, int maxSpeed, String yearOfMake, int numOfSeats) {
        this.addCar(new Truck_G7(truckWeight, loadCapacity, carName, price, new ArrayList<>(stockLevels), engineType, new ArrayList<>(reviews), maxSpeed, yearOfMake, numOfSeats));
    }

    // Method to get all cars in the collection
    @Override
    public ArrayList<Car_G7> getAllCars() {
        return new ArrayList<>(cars); // Return a new list containing all cars
    }

    // Method to get all SUVs in the collection
    @Override
    public ArrayList<Car_G7> getSUVs() {
        ArrayList<Car_G7> suvs = new ArrayList<>();
        // Loop through cars to find and add SUVs to the list
        for (Car_G7 car : cars) {
            if (car instanceof SUV_G7) {
                suvs.add(car);
            }
        }
        return suvs; // Return the list of SUVs
    }

    // Method to get all Sedans in the collection
    @Override
    public ArrayList<Car_G7> getSedans() {
        ArrayList<Car_G7> sedans = new ArrayList<>();
        // Loop through cars to find and add Sedans to the list
        for (Car_G7 car : cars) {
            if (car instanceof Sedan_G7) {
                sedans.add(car);
            }
        }
        return sedans; // Return the list of Sedans
    }

    // Method to get all Trucks in the collection
    @Override
    public ArrayList<Car_G7> getTrucks() {
        ArrayList<Car_G7> trucks = new ArrayList<>();
        // Loop through cars to find and add Trucks to the list
        for (Car_G7 car : cars) {
            if (car instanceof Truck_G7) {
                trucks.add(car);
            }
        }
        return trucks; // Return the list of Trucks
    }

    // Method to calculate and return the total price of all SUVs in the collection
    @Override
    public int priceOfSUVs() {
        int total = 0;
        ArrayList<Car_G7> SUVs = getSUVs();
        for(int i = 0; i < SUVs.size(); i++) {
            total = total + SUVs.get(i).getPrice();
        }
        return total; // Sum and return prices of all SUVs
    }

    // Method to calculate and return the total price of all Sedans in the collection
    @Override
    public int priceOfSedans() {
        int total = 0;
        ArrayList<Car_G7> Sedans = getSedans();
        for(int i = 0; i < Sedans.size(); i++) {
            total = total + Sedans.get(i).getPrice();
        }
        return total; // Sum and return prices of all Sedans
    }

    // Method to calculate and return the total price of all Trucks in the collection
    @Override
    public int priceOfTrucks() {
        int total = 0;
        ArrayList<Car_G7> Trucks = getTrucks();
        for(int i = 0; i < Trucks.size(); i++) {
            total = total + Trucks.get(i).getPrice();
        }
        return total; // Sum and return prices of all Trucks
    }
}

