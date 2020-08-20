import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // for (int i = 0; i < 3; i++) { // runs 3 times in total
        // System.out.println("Knock");
        // }
        // System.out.println("Penny!");

        // for (int i = 1; i <= 10; i++) {
        // System.out.printf("%d ", i); // prints the current value of the loop control
        // variable
        // }

        // System.out.println("Here's a simple multiplication table using nested
        // loops:");
        // for (int j = 1; j <= 10; j++) {
        // for (int i = 1; i <= 10; i++) {
        // System.out.printf("%d ", i * j);
        // }
        // System.out.println();
        // }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        String goOn = "yes";
        while (goOn.equals("yes")) {
            System.out.println("Enter the first number:");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the second number:");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println("Choose one of the following operations:");
            System.out.println("1 - addition");
            System.out.println("2 - subtraction");
            System.out.println("3 - multiplication");
            System.out.println("4 - division");
            int option = Integer.parseInt(scanner.nextLine());
            double result = 0;
            switch (option) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a / b;
                    break;
            }
            if ((option > 0) && (option < 5)) {
                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid option");
            }
            System.out.println("Would you like to make another calculation? [yes/no]");
            goOn = scanner.nextLine();
        }
        System.out.println("Thank you for using our calculator.");
    }

}