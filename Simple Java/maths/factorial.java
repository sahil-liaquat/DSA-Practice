import java.util.Scanner;

public class factorial {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

           System.out.println("Enter Number: ");
           int num = scanner.nextInt();
            int fact = 1;
           for(int i=1; i<=num; i++){

            fact = fact * i;

           }
           
           System.out.println("Factorials are "+fact);

                
            

    }
}
