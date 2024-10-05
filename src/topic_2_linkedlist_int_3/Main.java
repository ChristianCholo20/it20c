package linkedlist;

public class LinkedList {
    private Node head; // The first node in the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        head = null; // The list starts as empty
    }

    // Method to add a node at the end of the linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, head points to the new node
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the last node
            }
            current.next = newNode; // Append the new node to the end
        }
    }

    // Method to remove a node by its value
    public boolean removeNode(int data) {
        if (head == null) {
            return false; // Return false if the list is empty
        }

        if (head.data == data) {
            head = head.next; // If the node to be removed is the head, update the head
            return true;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next; // Traverse to find the node with the matching data
        }

        if (current == null) {
            return false; // Node with the given value not found
        }

        previous.next = current.next; // Unlink the node
        return true;
    }

    // Method to display all nodes in the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Traverse through the list
        }
        System.out.println("null"); // Indicate end of the list
    }
}
