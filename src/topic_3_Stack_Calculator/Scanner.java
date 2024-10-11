package topic_3_stack_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackCalculator calculator = new StackCalculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStack Calculator:");
            System.out.println("1. Push number onto stack (0-9)");
            System.out.println("2. Add (+)");
            System.out.println("3. Subtract (-)");
            System.out.println("4. Multiply (*)");
            System.out.println("5. Divide (/)");
            System.out.println("6. Show Stack");
            System.out.println("7. Exit");

            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number (0-9): ");
                    int number = scanner.nextInt();
                    if (number >= 0 && number <= 9) {
                        calculator.pushNumber(number);
                    } else {
                        System.out.println("Invalid input! Please enter a number between 0 and 9.");
                    }
                    break;
                case 2:
                    calculator.add();
                    break;
                case 3:
                    calculator.subtract();
                    break;
                case 4:
                    calculator.multiply();
                    break;
                case 5:
                    calculator.divide();
                    break;
                case 6:
                    calculator.showStack();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
