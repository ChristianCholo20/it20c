import java.util.Scanner;

public class RecursiveFactorial {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;  // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Check if the number is negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Call the recursive factorial method and print the result
            int result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }

        scanner.close();
    }
}
