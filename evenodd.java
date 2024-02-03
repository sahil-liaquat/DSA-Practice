import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking whether the number is even or odd
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Function to check whether a number is even
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
