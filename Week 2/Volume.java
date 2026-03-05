import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        // Calculate volume: V = π r² h
        double volumeResult = 3.142 * radius * radius * height;
        
        // Calculate surface area: SA = 2π r² + 2π r h
        double surfaceArea = 2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;
        
        // Display results
        System.out.println("\n--- Cylinder Calculations ---");
        System.out.printf("Radius: %.2f units%n", radius);
        System.out.printf("Height: %.2f units%n", height);
        System.out.printf("Volume: %.2f cubic units%n", volumeResult);
        System.out.printf("Surface Area: %.2f square units%n", surfaceArea);
        System.out.println("-----------------------------");
        
        scanner.close();
    }
}
