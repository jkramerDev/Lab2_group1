package queue;

public class QueueTester {

	public static void main(String[] args) {

		Queue q = new QueueImpl();
		q.enQueue("thing 1");
		q.enQueue("thing 2");
		q.enQueue("thing 3");
		q.enQueue("thing 4");
		
		System.out.println("Queue Head: " + q.peek());
		q.display();
		
		q.deQueue();
		
		System.out.println("Queue Head: " + q.peek());
		q.display();
	}

}
