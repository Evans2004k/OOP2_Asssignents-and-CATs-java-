// NAME:EVANS MAWIRA
//REG NO: CT100/G/21515/24
import java.util.Scanner;

public class waterbill{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of water units consumed: ");
        double units = scanner.nextDouble();

        double Totalbill = 0;

       if (units >= 0 && units <=30) {
          Totalbill = units * 20;
       }else if (units > 30 && units <= 60) {
         Totalbill = units * 25;       
       }else if (units > 60) {
          Totalbill = units * 30;
        }

       System.out.println("The water bill amount is: " + Totalbill);

        scanner.close();
    }
 }
