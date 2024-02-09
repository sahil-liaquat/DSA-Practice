import java.util.Scanner;

public class greetingsfn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        String greetings = take(name);

       System.out.println("Hello  "+greetings);

    }

            public static String take(String name){

                return name;
            }
    
}
