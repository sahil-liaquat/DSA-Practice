import java.util.Scanner;

public class largest {
public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter the first number:");
   int num1= scanner.nextInt();

   System.out.println("Enter the second number:");
   int num2 = scanner.nextInt();

   if(num1>num2){
    System.out.println(+num1+ " is largest");
   }
   else{
    System.out.println(+num2+ " is largest");
   }

    }
}