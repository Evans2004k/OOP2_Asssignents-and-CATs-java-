// NAME:EVANS MAWIRA
//Registration number: CT100/G/21515/24
import java.util.Scanner;

public class Electric_bill {

      public static double calculateElectricBill(int units) {
        double bill = 0;

        if (units <= 100) {
            bill = units * 10;
        } else if (units <= 200) {
            bill = (100 * 10) + ((units - 100) * 15);
        } else {
            bill = (100 * 10) + (100 * 15) + ((units - 200) * 20);
        }
        return bill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();

        double bill = calculateElectricBill(units);
        System.out.printf("Total Electric Bill: KSh %.2f%n", bill);

        scanner.close();
    }
    
}
