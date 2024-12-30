import java.util.*;

public class input_from_user {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        System.out.println("Your name is " + name + ", you are " + age + " years old, and you make Rs" + salary + " per year.");

        scan.close();
    }
}