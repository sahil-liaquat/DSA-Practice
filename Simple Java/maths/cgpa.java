import java.util.Scanner;

public class cgpa {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total grade points earned: ");
        int grade = scanner.nextInt();

        System.out.println("Enter total credit hours:");
        int hours = scanner.nextInt();

            double cgpa = grade / hours;

            System.out.println("Total CGPA:  "+cgpa);

    }
}

