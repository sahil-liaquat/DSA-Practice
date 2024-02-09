import java.util.Scanner;

public class rectangle {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Length:");
    int l = scanner.nextInt();

    System.out.println("Enter Breadth");
    int b = scanner.nextInt();

    int area = l * b;
     
    System.out.println("Area of rectangle: "+area);
    }
}