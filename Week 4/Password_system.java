// NAME:EVANS MAWIRA
//REG NO: CT100/G/21515/24
import java.util.Scanner;
public class Password_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        final String CORRECT = "1234";

        do {
            System.out.print("Enter password: ");
            password = scanner.next();

            if (!password.equals(CORRECT)) {
                System.out.println("Incorrect password. Try again.");
            }
        } while (!password.equals(CORRECT));

        System.out.println("Access Granted.");
        scanner.close();
    }
    
}
