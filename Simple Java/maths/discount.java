import java.util.Scanner;

public class discount {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter Original Price: $");
double originalprice = scanner.nextDouble();

System.out.println("Enter the Discounted rate in %");
double rate = scanner.nextDouble();

double discounta = (originalprice * rate)/100;

double  discountp = originalprice - discounta;

System.out.println("Discounted Amount: "+discounta);
System.out.println("Discounted Price: "+discountp);
    }
}

