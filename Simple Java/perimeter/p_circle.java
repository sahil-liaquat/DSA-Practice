import java.util.Scanner;

public class p_circle {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Radius:");
        double radius = scanner.nextDouble();

        double pii = 3.14;
        
        double perimeter = 2 * pii * radius;

        System.out.println("Perimeter of Circle:"+perimeter);
    }
}