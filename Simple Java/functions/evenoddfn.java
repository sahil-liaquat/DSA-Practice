import java.util.Scanner;

public class evenoddfn {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter any Number: ");
        int num =scanner.nextInt();

        
        String value =evenOdd(num);

       System.out.println(value);
    }

    public static String evenOdd(int num){

                        if(num%2==0){

                            return "even";
                        }else{
                            return "odd";
                        }
    }
}
