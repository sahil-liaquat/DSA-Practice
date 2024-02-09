import java.util.Scanner;

public class battingaverage {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Runs Scored ");
        int runs = scanner.nextInt();

        System.out.println("Enter Number of times out ");
        int out = scanner.nextInt();

            double bat = runs/ out;

            System.out.println("Batting Average= "+bat);

    }
}

