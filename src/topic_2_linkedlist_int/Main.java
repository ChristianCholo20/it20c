package linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList(); // Create LinkedList object
        
        while (true) {
            System.out.println("\nLinkedList Operations:");
            System.out.println("1. Boom PAnes");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // To consume the newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    int value = scanner.nextInt();
                    linkedList.addNode(value); // Add item to linked list
                    System.out.println("Item added: " + value);
                    break;

                case 2:
                    System.out.print("Enter item to remove: ");
                    int valueToRemove = scanner.nextInt();
                    boolean removed = linkedList.removeNode(valueToRemove); // Remove item from linked list
                    if (removed) {
                        System.out.println("Item removed: " + valueToRemove);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 3:
                    System.out.println("Displaying Items:");
                    linkedList.display(); // Display all items
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

