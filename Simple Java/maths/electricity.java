import java.util.Scanner;

public class electricity {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

                System.out.println("Enter the usage in KWH:");
                double usage = scanner.nextDouble();

                System.out.println("Enter the rate: ");
                double rate = scanner.nextDouble();


                    double bill= usage * rate;

                    System.out.println("Bill is "+bill+"KWH");
                
            

    }
}
