
import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height (meters or centimeters): ");
        float height = scanner.nextFloat();

        System.out.print("Enter your bank balance (KES): ");
        double balance = scanner.nextDouble();

        System.out.print("Enter your phone number: ");
        String phone = scanner.next();

        System.out.println();
        System.out.println("--- User Input Credintials ---");
        System.out.println("Height: " + height);
        System.out.printf("Bank Balance: KES %.2f%n", balance);
        System.out.println("Phone Number: " + phone);
        System.out.println("------------Thanks for provinding your details--------------");

        scanner.close();
    }
}
