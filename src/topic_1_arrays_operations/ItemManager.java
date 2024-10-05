package topic_1_arraylist_operations;
import java.util.ArrayList;

public class ItemManager {

	private ArrayList<String> items;

    // Constructor to initialize the ArrayList
    public ItemManager() {
        items = new ArrayList<>();
    }

    // Display
    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }

    // Insert Item
    public void insertItem(String item) {
        items.add(item);
        System.out.println("Inserted: " + item);
@@ -31,7 +31,7 @@
    	} 	
    }

 // Find
    public int findItem(String item) {
        int index = items.indexOf(item);
        if (index != -1) {
@@ -42,6 +42,14 @@
        return index;
    }

    // Delete
    public void deleteItem(int index) {
        if (index >= 0 && index < items.size()) {
            String removedItem = items.remove(index);
            System.out.println("Deleted: " + removedItem);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    }