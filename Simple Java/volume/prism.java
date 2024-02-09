import java.util.Scanner;

public class prism {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("ENter the Base Area");
        double base_area = scanner.nextDouble();

        System.out.println("Enter the Height");
        double height = scanner.nextDouble();

        double volume = base_area * height;

        System.out.println("Volume of Prism: "+volume);
    
    }
}
