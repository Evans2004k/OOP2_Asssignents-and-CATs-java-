import java.util.Scanner;

public class user_input {
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
        System.out.printf("Height:", height);
        System.out.printf("Bank Balance: KES", balance);
        System.out.println("Phone Number: " + phone);
        System.out.println("------------Thanks for provinding your details--------------");

        scanner.close();
    }
}
