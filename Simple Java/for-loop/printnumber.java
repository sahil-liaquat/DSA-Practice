import java.util.Scanner;

public class printnumber {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter Number: ");
      int num = scanner.nextInt();

      for(int i =1; i<=num; i++){

        System.out.println(i);
      }
    }
}

