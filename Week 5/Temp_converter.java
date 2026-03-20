

import java.util.Scanner;

public class Temp_converter {
  public static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = convertToCelsius(fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);

        scanner.close();
    }  
    
}
