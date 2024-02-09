import java.util.Scanner;

public class pyramid {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

       System.out.println("Enter BaseArea");
       double base_area = scanner.nextDouble();

       System.out.println("Enter Height");
       double height = scanner.nextDouble();

       double volume = (1.0/3.0) * base_area * height;

       System.out.println("Volume of Pyramid: "+volume);
    }
}