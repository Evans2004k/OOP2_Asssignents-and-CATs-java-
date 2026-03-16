// NAME:EVANS MAWIRA
//REG NO: CT100/G/21515/24
import java.util.Random;
import java.util.Scanner;
public class Number_guessing_game {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random   = new Random();

        int secretNumber = random.nextInt(20) + 1; // 1 to 20
        int attempts     = 0;
        int guess;

        System.out.println("Guess the number between 1 and 20!");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
    
    
}
