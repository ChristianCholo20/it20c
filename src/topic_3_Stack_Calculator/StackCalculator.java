package topic_3_stack_calculator;

import java.util.Stack;

public class StackCalculator {
    private Stack<Integer> stack;

    public StackCalculator() {
        stack = new Stack<>();
    }

    // Push number onto the stack
    public void pushNumber(int number) {
        stack.push(number);
        System.out.println(number + " pushed onto the stack.");
    }

    // Addition operation
    public void add() {
        if (stack.size() < 2) {
            System.out.println("Error: Not enough values in the stack.");
            return;
        }
        int num1 = stack.pop();
        int num2 = stack.pop();
        int result = num1 + num2;
        stack.push(result);
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    // Subtraction operation
    public void subtract() {
        if (stack.size() < 2) {
            System.out.println("Error: Not enough values in the stack.");
            return;
        }
        int num1 = stack.pop();
        int num2 = stack.pop();
        int result = num2 - num1;
        stack.push(result);
        System.out.println(num2 + " - " + num1 + " = " + result);
    }

    // Multiplication operation
    public void multiply() {
        if (stack.size() < 2) {
            System.out.println("Error: Not enough values in the stack.");
            return;
        }
        int num1 = stack.pop();
        int num2 = stack.pop();
        int result = num1 * num2;
        stack.push(result);
        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    // Division operation
    public void divide() {
        if (stack.size() < 2) {
            System.out.println("Error: Not enough values in the stack.");
            return;
        }
        int num1 = stack.pop();
        int num2 = stack.pop();
        if (num1 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            stack.push(num2);
            stack.push(num1);
        } else {
            int result = num2 / num1;
            stack.push(result);
            System.out.println(num2 + " / " + num1 + " = " + result);
        }
    }

    // Show the current state of the stack
    public void showStack() {
        System.out.println("Current stack: " + stack);
    }
}
