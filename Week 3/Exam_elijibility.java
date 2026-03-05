import java.util.Scanner;

public class Exam_elijibility{

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student attendance (%): ");
        double attendance = scanner.nextDouble();

        System.out.print("Enter student average marks (0-100): ");
        double averageMarks = scanner.nextDouble();

        if (attendance >= 75 && averageMarks >= 40) {
            System.out.println("The student is eligible to take the exam.");
        } else {
            System.out.println("The student is not eligible to take the exam.");
            
        }
        scanner.close();
    }
}