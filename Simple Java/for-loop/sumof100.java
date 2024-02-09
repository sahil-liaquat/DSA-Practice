import java.util.Scanner;

public class sumof100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for(int i=0; i<=100; i++){

            sum =sum+i;
        }
        System.out.println(sum);
    }
}

