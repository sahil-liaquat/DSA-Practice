import java.util.Scanner;

public class simpleinterest {
public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the Principal amount:");
    double principal = scanner.nextDouble();

    System.out.println("Enter the Rate:");
    double rate = scanner.nextDouble();

    System.out.println("Enter time in years");
    double time = scanner.nextDouble();

    double SimpleInterest = (principal * rate * time)/100;
    System.out.println("Simple Interest=" +SimpleInterest);

    }
}