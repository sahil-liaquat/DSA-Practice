import java.util.Scanner;

public class p_equilateral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Side");
        int side = scanner.nextInt();

        int perimeter = 3 * side;

        System.out.println("Perimeter of Equilateral Triangle: " + perimeter);

        scanner.close(); // It's good practice to close the scanner when you're done using it.
    }
}
