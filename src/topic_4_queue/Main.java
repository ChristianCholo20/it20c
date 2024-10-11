package topic_4_queue;

public class Main {

	public static void main(String[] args) {
		
		 Queue customerQueue = new Queue();
		 
		 // Adding customers to the queue
	     customerQueue.enqueue(new Customer("Chriatian"));
	     customerQueue.enqueue(new Customer("Janoi"));
	     customerQueue.enqueue(new Customer("Redd"));
	     
	     System.out.println();
	     customerQueue.displayQueue();
	     
	     // Serve 
	     customerQueue.dequeue();
	     
	     System.out.println();
	     customerQueue.displayQueue();


	}

}