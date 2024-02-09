import java.util.Scanner;

public class cylinder {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Radius");
        double radius = scanner.nextDouble();

        System.out.println("Enter Height");
        double height = scanner.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume of Cylinder: "+ volume);
    }
}
