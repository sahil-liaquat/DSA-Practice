import java.util.Scanner;

public class rhombus {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Diagonal 1:");
            double d1 = scanner.nextDouble();

            System.out.println("Enter the Diagonal 2:");
            double d2 = scanner.nextDouble();

            double area = (d1 * d2)/2;

            System.out.println("Area of Rhombus:"+area);
    }
}
