import java.util.Scanner;
public class greaterof2fn {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter First Number: ");
    int num1 = scanner.nextInt();

    System.out.println("Enter Second Number: ");
    int num2 = scanner.nextInt();

    int greater = findgreater(num1,num2);
    System.out.println("Greatest of two number is : "+greater);
    scanner.close();
  }

  public static int findgreater(int num1, int num2){

                        if(num1>num2){
                            return num1;
                
                        }else{

                          return num2;
                        }

                      

  }


    
  }  

