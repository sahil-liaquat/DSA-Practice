import java.util.Scanner;

public class parallelogram {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Base: ");
        double b = scanner.nextDouble();

        System.out.println("Enter height: ");
        double h = scanner.nextDouble();

        double area = b*h;

        System.out.println("Area of parallelogram: "+area);


    }
}