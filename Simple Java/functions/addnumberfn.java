import java.util.Scanner;

public class addnumberfn {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter number 1");
       int num1 = scanner.nextInt();

       System.out.println("Enter number 2");
       int num2  = scanner.nextInt();

       int sum = add(num1, num2);

       System.out.println("Addition of two number is : "+sum);

       scanner.close();
    }

       public static int add(int num1, int num2){

        return num1 + num2;


       }





    
}
