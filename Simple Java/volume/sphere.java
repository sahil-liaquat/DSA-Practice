import java.util.Scanner;

public class sphere {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Radius");
        double radius = scanner.nextDouble();

        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Volume of Sphere: "+volume);
    }
}
