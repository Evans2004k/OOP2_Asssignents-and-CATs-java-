// NAME:EVANS MAWIRA
//Registration number: CT100/G/21515/24

import java.io.*;
public class Student_Results {
     public static void main(String[] args) {
        // Read student records from binary file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("results.data"))) {
            System.out.println("===== Student Results =====");
            while (true) {
                try {
                    String name   = (String) ois.readObject();
                    String regNo  = (String) ois.readObject();
                    int marks     = ois.readInt();
                    System.out.println("Name: " + name + " | Marks: " + marks);
                } catch (EOFException e) {
                    break; // end of file
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

     public Student_Results() {
     }

    
}
