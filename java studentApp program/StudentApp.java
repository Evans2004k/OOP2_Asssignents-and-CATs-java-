import java.util.Scanner;

// Class to store student details
class StudentRecord {
    String studentID;
    String name;
    String course;

    // Constructor
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Main application class
public class StudentApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Create StudentRecord object
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Display student information
        student.displayInfo();

        scanner.close();
    }
}