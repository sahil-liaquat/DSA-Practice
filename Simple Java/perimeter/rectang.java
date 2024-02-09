import java.util.Scanner;

public class rectang {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Length:");
        int l = scanner.nextInt();

        System.out.println("Enter the Breadth:");
        int b = scanner.nextInt();

        int perimeter = 2 * (l + b);

        System.out.println("Perimeter of Rectangle:"+perimeter);
    }
}