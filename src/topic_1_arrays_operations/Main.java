package topic_1_arraylist_operations;

public class Main {

	public static void main(String[] args) {

         ItemManager manager = new ItemManager();

	     manager.insertItem("IT20");
	     manager.insertItem("Data Structures and Algorithms");

	     manager.displayItems();

	     System.out.println();
	     manager.updateItem(0, "IT21");
	     manager.updateItem(1, "Object Oriented Programming");

	     System.out.println();
	     manager.displayItems();
	     manager.findItem("Data Structures and Algorithms");
	     manager.findItem("Object Oriented Programming");
	     
	     System.out.println();
	     manager.deleteItem(0);
	     manager.displayItems();

	}

}