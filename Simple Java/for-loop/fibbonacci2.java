import java.util.Scanner;

public class fibbonacci2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

    

                        int num1 = 0, num2 =1, sum;
                        System.out.println(num1);
                        System.out.println(num2);
                        
                    for(int i=0; i<10; i++){

                        sum =num1 + num2;

                        System.out.println(sum);

                        num1 =num2;
                        num2 =sum;
                    }
                

      }
    }


