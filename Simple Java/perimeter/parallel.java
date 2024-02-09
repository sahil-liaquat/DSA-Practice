import java.util.Scanner;

public class parallel {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter Side 1:");
int side1  = scanner.nextInt();

System.out.println("Enter Side 2:");
int side2 = scanner.nextInt();

int perimeter = 2 * (side1 + side2);

System.out.println("Perimeter of parallelogram "+perimeter);
    }
}