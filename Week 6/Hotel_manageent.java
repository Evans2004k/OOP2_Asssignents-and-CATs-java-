

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Hotel_manageent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random   = new Random();

       
        double[] revenue = new double[7];
        String[] days    = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("===== Weekly Revenue Tracker =====");
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter revenue for " + days[i] + ": KES ");
            revenue[i] = scanner.nextDouble();
        }

        double totalRevenue = 0;
        for (double r : revenue) totalRevenue += r;
        double avgRevenue = totalRevenue / 7;

        System.out.printf("%nTotal Weekly Revenue  : KES %.2f%n", totalRevenue);
        System.out.printf("Average Daily Revenue : KES %.2f%n", avgRevenue);

      
        int[][] occupancy = new int[5][10];

        
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 10; j++)
                occupancy[i][j] = random.nextInt(2); // 0 or 1

        System.out.println("\n===== Room Occupancy (One Branch) =====");
        for (int i = 0; i < 5; i++) {
            int occupied = 0, vacant = 0;
            for (int j = 0; j < 10; j++) {
                if (occupancy[i][j] == 1) occupied++;
                else vacant++;
            }
            System.out.println("Floor " + (i + 1) + " → Occupied: " + occupied + " | Vacant: " + vacant);
        }

      
        int[][][] chain = new int[3][5][10];
        int totalOccupied = 0;

        for (int b = 0; b < 3; b++)
            for (int f = 0; f < 5; f++)
                for (int r = 0; r < 10; r++) {
                    chain[b][f][r] = random.nextInt(2);
                    totalOccupied += chain[b][f][r];
                }

        System.out.println("\n===== All Branches Occupancy =====");
        System.out.println("Total Occupied Rooms Across All Branches: " + totalOccupied);

        scanner.close();
    }  
    
}
