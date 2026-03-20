import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class LibraryBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title to record: ");
        String title = scanner.nextLine();

        // Append mode = true, so existing records are NOT deleted
        try (FileWriter writer = new FileWriter("borrowed_books.txt", true)) {
            writer.write(title + System.lineSeparator());
            System.out.println("Book title \"" + title + "\" successfully stored.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}