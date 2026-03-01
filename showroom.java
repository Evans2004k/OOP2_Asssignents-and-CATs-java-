import java.util.Scanner;

// Base class
class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass
class Car extends Vehicle {
    String fuelType;

    // Constructor
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);  // Call parent constructor
        this.fuelType = fuelType;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();  // Display Vehicle details
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main class
public class Showroom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Create Car object
        Car car = new Car(brand, model, year, fuelType);

        // Display car details
        System.out.println("\nCar Details:");
        car.displayDetails();

        scanner.close();
    }