import java.util.Scanner;

public class triangle {
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in) ;

    System.out.println("Enter the height of triangle");
    double h = scanner.nextDouble();

    System.out.println("Enter the Breadth of triangle");
    double b = scanner.nextDouble();

    double area = 0.5 * b * h;

    System.out.println("Area of Triangle is: "+area);

    
    }
}