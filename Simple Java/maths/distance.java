import java.util.Scanner;

public class distance {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coorditates of x1: ");
        int x1 = scanner.nextInt();

         System.out.println("Enter the coorditates of x2: ");
        int x2 = scanner.nextInt();

        System.out.println("Enter the coorditates of y1: ");
        int y1 = scanner.nextInt(); 

        System.out.println("Enter the coorditates of y2: ");
        int y2 = scanner.nextInt();

        double d = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2)   );

        System.out.println("Distance between two points is: "+d);

    }
}

