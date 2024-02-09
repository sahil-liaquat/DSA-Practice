import java.util.Scanner;

public class equilateral {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Side");
        double s = scanner.nextDouble();

        double area = ( Math.sqrt(3)/4 ) * s * s;

        System.out.println("Area of Equilateral Triangle: "+area);
    }
}
