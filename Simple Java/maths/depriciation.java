import java.util.Scanner;

public class depriciation {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Initial Cost ");
        int initial = scanner.nextInt();

        System.out.println("Enter Salvage Cost ");
        int salvage = scanner.nextInt();

        System.out.println("Enter Useful life  ");
        int life = scanner.nextInt();

            double dep = (initial - salvage)/ life;

            System.out.println("Depreriation of Value= "+dep);

    }
}

