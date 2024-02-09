import java.util.Scanner;

public class percentage {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Commission Amount ");
        int amount = scanner.nextInt();

        System.out.println("Enter Total Sales ");
        int sales = scanner.nextInt();

            double percentage = (amount/sales) * 100;

            System.out.println("Commission Percentage= "+percentage);

    }
}

