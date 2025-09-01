# E-commerce Car Management System (Group 7)

This project is a **Java-based E-commerce Car Management System** developed for the CSC301 (Data Structures and Algorithms) course.  
It demonstrates **Object-Oriented Programming (OOP) principles** including **inheritance, abstraction, encapsulation, and polymorphism** through a structured class hierarchy for managing cars in an online platform.

---

## 📌 Features
- Add new cars to categories (SUV, Sedan, Truck).
- Update car details such as price, stock, engine type, and specifications.
- Bulk addition of cars from a file (`carList.txt`).
- List all cars in a category.
- Calculate the total stock value of a selected category.
- Manage customer reviews and extra attributes per car type.
- Menu-driven console interface for easy interaction.

---

## 🛠️ Implementation Details
- **Abstract class & inheritance** used to model different car types (`Car_G7`, `SUV_G7`, `Sedan_G7`, `Truck_G7`).
- **Encapsulation** ensures data safety with private fields and getters/setters.
- **Polymorphism** through overridden methods for category-specific behavior.
- **Data structures:** ArrayLists are used to manage dynamic car listings.
- **Manager classes:** `CarsManager_G7` and `Manager_G7` handle car operations and menu-driven control.

---

## 📂 Project Structure
```
src/
 ├── Car_G7.java          # Abstract base class
 ├── SUV_G7.java          # SUV-specific implementation
 ├── Sedan_G7.java        # Sedan-specific implementation
 ├── Truck_G7.java        # Truck-specific implementation
 ├── CarsManager_G7.java  # Core system manager
 ├── Manager_G7.java      # Menu-driven controller
 ├── EcommerceCarMS_G7.java # Main program entry point
 └── carList.txt          # Sample data for bulk addition
```

---

## 🚀 How to Run
1. Compile the project:
   ```bash
   javac *.java
   ```
2. Run the main program:
   ```bash
   java EcommerceCarMS_G7
   ```
3. Use the interactive menu to manage cars.

---

## 📖 Example `carList.txt`
```
SUV, Range Rover Sport, 75000, Diesel, 180, 2021, 5, Stock1, Stock2, Great car, 4WD
Sedan, BMW 3 Series, 50000, Petrol, 240, 2020, 5, Stock4, Excellent drive, true
Truck, Ford F-150, 60000, Diesel, 160, 2019, 3, Stock6, Powerful, 5000.5, 1500.75
```

---

## 🎯 Learning Outcomes
- Applying **OOP principles** in a real-world scenario.
- Designing a **class hierarchy** for modularity and reusability.
- Handling **file I/O** for bulk car addition.
- Working with **Java collections (ArrayLists)** for data management.

---

## 👨‍💻 Authors
Developed by **Group 7** for the CSC301 course.  
Each file name includes the `_G7` suffix as per submission guidelines.

---
