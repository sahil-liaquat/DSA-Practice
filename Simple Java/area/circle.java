import java.util.Scanner;

public class circle {
public static void main(String[] args){

   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter the radius");
   double r = scanner.nextDouble();

   double pii = 3.14;

   double area = pii * r * r;

   System.out.println("Area of Circle is " +area);
    
    }
}
