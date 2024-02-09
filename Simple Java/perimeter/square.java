import java.util.Scanner;

public class square {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter Side");
        int side = scanner.nextInt();

        int perimeter = 4 * side;
          
        System.out.println("Perimeter of Square: "+perimeter);
    }
}