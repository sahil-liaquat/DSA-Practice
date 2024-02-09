import java.util.Scanner;

public class currency {
public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter Currency Amaount in Rupees");
   double num1 = scanner.nextDouble();

   double usd = num1 / 83.02;
    System.out.println("$"+usd+ " USD");

    }
}