import java.util.Scanner;

public class fibonacci {
public static void main(String[] args){

    //0 1   1 2 3 5 8 13 21
    int num1 =0, num2=1, sum=0;

        System.out.println(num1+""+num2);//0 1
        

         for(int i=2; i<10; i++)
{
    sum = num1 + num2;
    System.out.println(" "+sum);// 1
         num1= num2 ;
         num2=sum;
}


    }
}
