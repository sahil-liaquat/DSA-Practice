import java.util.Scanner;

public class subtractproductsum {
public static void main(String[] args){

  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter Integer");
  int num = scanner.nextInt();

        int sum=0, product=1;

        while(num>0){
            
            int temp = num%10;
            num = num/10;
            sum= sum+temp;
            product= product * temp;

        }
        int subtract = product - sum;
      System.out.println("The product Sum is: "+subtract);
    }
}
