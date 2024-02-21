package queue;

public class QueueTester {

    public static void main(String[] args) {
        testEnQueue();
        testDeQueue();
        testDisplay();
        testPeek();
    }

    public static void testEnQueue() {
        System.out.println("-- TESTING ENQUEUE --");
        Queue q = new QueueImpl();
        q.enQueue("thing 1");
        q.enQueue("thing 2");
        q.enQueue("thing 3");
        q.enQueue("thing 4");
        q.enQueue("thing 5"); 
        q.display();
        System.out.println();
    }

    public static void testDeQueue() {
        System.out.println("-- TESTING DEQUEUE --");
        Queue q = new QueueImpl();
        q.enQueue("thing 1");
        q.enQueue("thing 2");
        q.enQueue("thing 3");
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue(); 
        q.display();
        System.out.println();
    }

    public static void testDisplay() {
        System.out.println("-- TESTING DISPLAY --");
        Queue q = new QueueImpl();
        q.enQueue("thing 1");
        q.enQueue("thing 2");
        q.enQueue("thing 3");
        q.enQueue("thing 4");
        q.display();
        System.out.println();
    }

    public static void testPeek() {
        System.out.println("-- TESTING PEEK --");
        Queue q = new QueueImpl();
        q.enQueue("thing 1");
        q.enQueue("thing 2");
        q.enQueue("thing 3");
        System.out.println("Queue Head: " + q.peek());
        q.display();
        System.out.println();
    }
}