package Group7;

import java.util.ArrayList;
import java.util.Scanner;

/*
@author Mohammad Fares 1088672
        Omar Mohammad 1088546
        Hadi Albanna 1088677
 */
public class EcommerceCarMS_G7 {

    public static void main(String[] args) {
        CarsManager_G7 manager = new CarsManager_G7();
        int userChoice;
        do {
            displayMenu();
            userChoice = userMenuChoice();
            switch (userChoice) {
                case 1:
                    addCarToCategory(manager);
                    break;   // 1- Add a new car to a category.
                case 2:
                    updateCarDetails(manager);
                    break;  // 2- Update car details (price, stock, etc.).
                case 3:
                    addCarsFromFile(manager);
                    break;   // 3- Bulk addition of cars from a file.
                case 4:
                    listAllCars(manager);
                    break;       // 4- List all cars in a category.
                case 5:
                    calculateTotalStockValue(manager);
                    break;  // 5- Calculate the total stock value of a category.
                case 0:
                    System.out.println("Thank you for using the E-commerce Cars Management System. Goodbye!");
                    break; // Quit
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (userChoice != 0);
    }

    public static void displayMenu() {
        System.out.println("---------------------------------------------------------");
        System.out.println("E-commerce Car Management System");
        System.out.println("---------------------------------------------------------");
        System.out.println("1- Add a new car to a category.");
        System.out.println("2- Update car details (price, stock, etc.).");
        System.out.println("3- Bulk addition of cars from a file.");
        System.out.println("4- List all cars in a category.");
        System.out.println("5- Calculate the total stock value of a category.");
        System.out.println("0- Quit");
        System.out.println("---------------------------------------------------------");
    }

    public static int userMenuChoice() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Your choice (0, 1, 2, 3, 4, 5):");
            choice = input.nextInt();
            System.out.println("");
            if (choice > 5) {
                System.out.println("Please enter a valid choice");
            }
        } while (choice > 5);
        return choice;
    }

    public static void addCarToCategory(CarsManager_G7 manager) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("---------------------------------------------------------");
        System.out.println("Which Car Type:");
        System.out.println("0- Back");
        System.out.println("1- SUV");
        System.out.println("2- Sedan");
        System.out.println("3- Truck");
        System.out.println("---------------------------------------------------------");

        do {
            System.out.print("Your choice (0, 1, 2, 3): ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
            choice = input.nextInt();
            if (choice < 0 || choice > 3) {
                System.out.println("Please enter a valid choice");
            }
        } while (choice < 0 || choice > 3);

        if (choice == 0) {
            return; // Return to the previous menu
        }
        String carName;
        int price;
        String engineType;
        int maxSpeed;
        String yearOfMake;
        int numOfSeats;
        ArrayList<String> stockLevels = new ArrayList<>();
        ArrayList<String> reviews = new ArrayList<>();

        input.nextLine(); // Consume newline

        // Common input method for all car types
        System.out.print("Enter the car's name: ");
        carName = input.nextLine();
        System.out.print("Enter the car's price: ");
        price = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter the car's engine type: ");
        engineType = input.nextLine();
        System.out.print("Enter the car's maximum speed: ");
        maxSpeed = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter the car's Year Of Make: ");
        yearOfMake = input.nextLine();
        System.out.print("Enter the car's Number Of Seats: ");
        numOfSeats = input.nextInt();
        input.nextLine(); // Consume newline

        // Stock Levels Input
        System.out.print("Enter the car's stock levels (comma separated): ");
        String stocks = input.nextLine();
        for (String stock : stocks.split(", ")) { // Handle optional whitespace
            stockLevels.add(stock);
        }

        // Reviews Input
        System.out.print("Enter the car's reviews (comma separated): ");
        String revs = input.nextLine();
        for (String rev : revs.split(", ")) { // Handle optional whitespace
            reviews.add(rev);
        }

        // Add the car based on user choice
        switch (choice) {
            case 1: // SUV
                System.out.print("Enter drivetrain options: ");
                String drivetrainOptions = input.nextLine(); // Added variable
                manager.addCar(new SUV_G7(drivetrainOptions, carName, price, stockLevels, engineType, reviews, maxSpeed, yearOfMake, numOfSeats));
                break;
            case 2: // Sedan
                System.out.print("Is it sporty (true/false): ");
                boolean sport = input.nextBoolean(); // Added variable
                System.out.print("Is it luxury (true/false): ");
                boolean luxury = input.nextBoolean(); // Added variable
                manager.addCar(new Sedan_G7(sport, luxury, carName, price, stockLevels, engineType, reviews, maxSpeed, yearOfMake, numOfSeats));
                break;
            case 3: // Truck
                System.out.print("Enter truck weight: ");
                double truckWeight = input.nextDouble(); // Added variable
                System.out.print("Enter load capacity: ");
                double loadCapacity = input.nextDouble(); // Added variable
                manager.addCar(new Truck_G7(truckWeight, loadCapacity, carName, price, stockLevels, engineType, reviews, maxSpeed, yearOfMake, numOfSeats));
                break;
        }
        System.out.println("Car added successfully!");
    }

    public static void updateCarDetails(CarsManager_G7 manager) {
        ArrayList<Car_G7> cars = manager.getAllCars();

        System.out.println("---------------------------------------------------------");
        System.out.println("Choose a car to update: ");
        System.out.println("0- back");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i + 1) + "- " + cars.get(i).getCarName());
        }
        System.out.println("---------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Your choice: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
            choice = input.nextInt();
            if (choice < 0 || choice > cars.size()) {
                System.out.println("Please enter a valid choice");
            }
        } while (choice < 0 || choice > cars.size());

        if (choice == 0) {
            return; // Return to the previous menu
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Which detail to update:");
        System.out.println("0- Back");
        System.out.println("1- Car Name");
        System.out.println("2- Price");
        System.out.println("3- Engine Type");
        System.out.println("4- Max Speed");
        System.out.println("5- Year Of Make");
        System.out.println("6- Number Of Seats");
        System.out.println("7- Add A New Stock Level");
        System.out.println("8- Add A New Review");
        System.out.println("9- Remove A Stock Level");
        System.out.println("10- Remove A Review");
        System.out.println("11- Truck Weight");
        System.out.println("12- LoadCapacity");
        System.out.println("13- Sport");
        System.out.println("14- Luxury");
        System.out.println("15- Drivetrain Options");
        System.out.println("---------------------------------------------------------");

        int detail;
        do {
            System.out.print("Your choice: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
            detail = input.nextInt();
            if (detail < 0 || detail > 15) {
                System.out.println("Please enter a valid choice");
            }
        } while (detail < 0 || detail > 15);

        // Update car details
        // Car carToUpdate = cars.get(choice - 1);
        switch (detail) {
            case 1: // Car Name
                input.nextLine(); // Consume newline
                System.out.print("Enter new name: ");
                String name = input.next();
                manager.updateName(cars.get(choice - 1).getCarName(), name);
                break;
            case 2: // Price
                System.out.print("Enter new price: ");
                int price = input.nextInt();
                manager.updatePrice(cars.get(choice - 1).getCarName(), price);
                break;
            case 3: // Engine Type
                input.nextLine(); // Consume newline
                System.out.print("Enter new engine type: ");
                String engineType = input.next();
                manager.updateEngineType(cars.get(choice - 1).getCarName(), engineType);
                break;
            case 4: // Max Speed
                System.out.print("Enter new max speed: ");
                int maxSpeed = input.nextInt();
                manager.updateMaxSpeed(cars.get(choice - 1).getCarName(), maxSpeed);
                break;
            case 5: // Year Of Make
                input.nextLine(); // Consume newline
                System.out.print("Enter new year of make: ");
                String yearOfMake = input.next();
                manager.updateYearOfMake(cars.get(choice - 1).getCarName(), yearOfMake);
                break;
            case 6: // Number Of Seats
                System.out.print("Enter new number of Seats: ");
                int numOfSeats = input.nextInt();
                manager.updateNumOfSeats(cars.get(choice - 1).getCarName(), numOfSeats);
                break;
            case 7: // Add New Stock Level
                input.nextLine(); // Consume newline
                System.out.print("Enter new stock level: ");
                String stock = input.next();
                manager.addStock(cars.get(choice - 1).getCarName(), stock);
                break;
            case 8: // Add New Review
                input.nextLine(); // Consume newline
                System.out.print("Enter new review: ");
                String review = input.next();
                manager.addReview(cars.get(choice - 1).getCarName(), review);
                break;
            case 9: // Remove Stock Level
                System.out.println("Stock levels of the car: ");
                System.out.println(cars.get(choice - 1).getStockLevels());
                System.out.println("Enter the stock level you want to remove: ");
                String remStock = input.next();
                manager.removeStock(cars.get(choice - 1).getCarName(), remStock);
                break;
            case 10: // Remove Review
                System.out.println("Reviews of the car: ");
                System.out.println(cars.get(choice - 1).getReviews());
                System.out.println("Enter the review you want to remove: ");
                String remReview = input.next();
                manager.removeReview(cars.get(choice - 1).getCarName(), remReview);
                break;
            case 11:
                System.out.print("Enter new truck weight: ");
                double weight = input.nextDouble();
                manager.updateTruckWeight(cars.get(choice - 1).getCarName(), weight);
            break;
            case 12:
                System.out.print("Enter new truck weight: ");
                double load = input.nextDouble();
                manager.updateLoadCapacity(cars.get(choice - 1).getCarName(), load);
            break;
            case 13:
                System.out.print("Do you want your sedan to be a sports sedan (true/false): ");
                boolean sport = input.nextBoolean();
                manager.updateSport(cars.get(choice - 1).getCarName(), sport);
            break;
            case 14:
                System.out.print("Do you want your sedan to be a luxury sedan (true/false): ");
                boolean lux = input.nextBoolean();
                manager.updateLuxury(cars.get(choice - 1).getCarName(), lux);
            break;
            case 15:
                System.out.print("Enter new Drivetrain Options: ");
                String option = input.next();
                manager.updateDrivetrainOptions(cars.get(choice - 1).getCarName(), option);
            break;
            
        }
    }

    public static void addCarsFromFile(CarsManager_G7 manager) {
        manager.addFromFile("carList.txt");
        System.out.println("Bulk addition of cars from file is successful!.");
    }

    public static void listAllCars(CarsManager_G7 manager) {
        ArrayList<Car_G7> cars = manager.getAllCars();
        System.out.println("---------------------------------------------------------");
        System.out.println("Listing all cars:");
        int i = 0;
        for (Car_G7 car : cars) {
            i++;
            
            System.out.println("Car#" + i);
            System.out.println("---------------------------------------------------------");
            System.out.println(car);
            System.out.println("---------------------------------------------------------");
        }
        System.out.println("---------------------------------------------------------");
    }

    public static void calculateTotalStockValue(CarsManager_G7 manager) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("---------------------------------------------------------");
        System.out.println("Which Category To Calculate The Value Of:");
        System.out.println("0- Back");
        System.out.println("1- SUV");
        System.out.println("2- Sedan");
        System.out.println("3- Truck");
        System.out.println("---------------------------------------------------------");

        do {
            System.out.println("Your choice: ");
            choice = input.nextInt();
            System.out.println("---------------------------------------------------------");
            if (choice > 3) {
                System.out.println("Please enter a valid choice");
            }
        } while (choice > 3);

        if (choice == 0) {
            return;
        }

        switch (choice) {
            case 1:
                System.out.println("The Total Price Of All SUVs: " + manager.priceOfSUVs());
                break;
            case 2:
                System.out.println("The Total Price Of All Sedans: " + manager.priceOfSedans());
                break;
            case 3:
                System.out.println("The Total Price Of All Trucks: " + manager.priceOfTrucks());
                break;
        }
    }
}
