import java.util.Scanner;

public class votefn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        boolean eligible = checkEligibility(age);

        if (eligible) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }

    public static boolean checkEligibility(int age) {
        return age > 18;
    }
}
