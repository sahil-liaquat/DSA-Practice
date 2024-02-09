import java.util.Scanner;

public class circumferenceofcircle {
    public static void main(String[] args) {
        
    
   Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Radius: ");
    int radius = scanner.nextInt();

    double circumference =find(radius);

    System.out.println("Circumference of Circle "+circumference);
    scanner.close();
    }


       public static double find(int radius)
       {
        double  circumference =  2 * Math.PI * radius;
        return circumference;

       }
                

   
    }


