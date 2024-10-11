package arraylist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemManager itemManager = new ItemManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. List Items");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String item = scanner.nextLine();
                    itemManager.addItem(item);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeItem = scanner.nextLine();
                    itemManager.removeItem(removeItem);
                    break;
                case 3:
                    itemManager.listItems();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
