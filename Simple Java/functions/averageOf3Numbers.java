import java.util.Scanner;

public class averageOf3Numbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 =scanner.nextInt();

        System.out.println("Enter 2nd Number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter 3rd NUmber: ");
        int num3 = scanner.nextInt();

        int average = average(num1,num2,num3);
        
        System.out.println("Average of Three number is : "+average);
        scanner.close();
    }

        public static int average(int num1, int num2, int num3){

           return  (num1 + num2 + num3)/3;

        }

    
}
