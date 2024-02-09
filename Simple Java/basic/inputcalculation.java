
import java.util.Scanner;

public class inputcalculation {
public static void main(String[] args){
    
   Scanner scanner = new Scanner(System.in);

System.out.println("Enter First Number");
int num1 = scanner.nextInt();

System.out.println("Choose Operator");
char operator = scanner.next().charAt(0);

System.out.println("Enter Second Number");
int num2 = scanner.nextInt();

int result = 0;

if(operator == '+')
{
    result = num1 + num2;
} 
else if(operator == '-')
{
    result = num1 - num2;
}
else if(operator == '*')
{
    result = num1 * num2;
}
else if (operator == '/')
{
    result = num1 / num2;
}
else{
   System.out.println("Enter Valid Operator"); 
}
System.out.println("Result:" +result);
}
 }
