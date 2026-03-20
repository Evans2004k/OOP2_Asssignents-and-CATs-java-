

import java.io.*;
public class Sale_Total {
    public static void main(String[] args) {
        double totalSales = 0;

      
        try (BufferedReader reader = new BufferedReader(new FileReader("sales.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalSales += Double.parseDouble(line.trim());
            }
            System.out.printf("Total Sales for the Day: KES %.2f%n", totalSales);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
}
