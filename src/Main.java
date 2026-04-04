import java.util.Scanner;

public class myFourthApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lower = input.nextInt();
            int upper = input.nextInt();

            if (upper <= lower) {
                System.out.println("Done");
                break;
            }

            int sum = 0;

            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }
            System.out.println("The sum of squares is: " + sum);
        }
    }
}
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1- Add");
            System.out.println("2- Subtract");
            System.out.println("3- Multiply");
            System.out.println("4- Divide");
            System.out.println("0- Exit");

            System.out.print("Choose: ");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option!");
                continue;
            }

            System.out.print("Enter two numbers: ");
            double a = input.nextDouble();
            double b = input.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }
                    break;
            }
        }
    }
}