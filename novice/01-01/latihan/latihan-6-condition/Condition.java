
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = Integer.parseInt(scanner.nextLine());
        if (age == 25) {
            System.out.println("Hey, I'm 25 too!"); // printed only when 25 is entered
            System.out.println("Nice to meet you!");
        } else {
            if (age == 20 || age == 14) {
                System.out.println("One my brother is of that age too!"); // printed only when 20 is entered
            }
            System.out.println("Nice to meet you, I'm 25!");
        }
        System.out.println("Thanks for your age!"); // printed always
    }
}