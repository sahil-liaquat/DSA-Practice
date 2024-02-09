import java.util.Scanner;

public class isosceles {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base:");
        double b = scanner.nextDouble();

        System.out.println("Enter the Height:");
        double h = scanner.nextDouble();

        double area = 0.5 * b * h;

        System.out.println("Area of Iscoles Triangle: "+area);

    }
}