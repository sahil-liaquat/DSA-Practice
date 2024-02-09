import java.util.Scanner;

public class sumofoddfn {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter number  ");
      int num = scanner.nextInt();


                int sum = sumOfOddNumber(num);
            

      System.out.println("Sum of ODD Numbers from 0 to " +num+ " is "+sum);

      scanner.close();
    }
                  public static int sumOfOddNumber(int num){

                    int sum = 0;

                    for( int i=0; i<=num; i++){

                        if(i%2!=0){
                        
                            sum= sum+i;
                        
                        }

                    }
                    return sum;

                  }

        
}
