
import java.util.Scanner;

public class Data_Buddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select data bundle:");
        System.out.println("1. 100MB @ 50Ksh:");
        System.out.println("2. 500MB @ 200Ksh:");
        System.out.println("3. 1GB @ 350Ksh:");
        System.out.println("4. 2GB @ 600Ksh:");

        System.out.println("Enter your choice (1-4):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have selected 100MB @ 50Ksh");
                break;
            case 2:
                System.out.println("You have selected 500MB @ 200Ksh");
                break;
            case 3:
                System.out.println("You have selected 1GB @ 350Ksh");
                break;
            case 4:
                System.out.println("You have selected 2GB @ 600Ksh");
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
        }
    }

