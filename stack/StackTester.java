package stack;

public class StackTester {
    public static void main(String[] args) {
        testPush();
        testPop();
        testIsEmpty();
        testIsFull();
        testSize();
        testPeek();
        testSetCapacity();
        testDisplay();
    }

    public static void testPush() {
        System.out.println("-- TESTING PUSH --");
        Stack stack = new StackImpl();
        stack.push("Thingamajig 1");
        stack.push("Thingamajig 2");
        stack.push("Thingamajig 3");
        stack.display();
        System.out.println();
    }

    public static void testPop() {
        System.out.println("-- TESTING POP --");
        Stack stack = new StackImpl();
        stack.push("Thingamajig 1");
        stack.push("Thingamajig 2");
        stack.push("Thingamajig 3");
        System.out.println("Popped element: " + stack.pop());
        stack.display();
        System.out.println();
    }

    public static void testIsEmpty() {
        System.out.println("-- TESTING ISEMPTY --");
        Stack stack = new StackImpl();
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println();
    }

    public static void testIsFull() {
        System.out.println("-- TESTING ISFULL --");
        Stack stack = new StackImpl();
        stack.push("Thingamajig 1");
        stack.push("Thingamajig 2");
        stack.push("Thingamajig 3");
        stack.push("Thingamajig 4");
        stack.push("Thingamajig 5");
        stack.push("Thingamajig 6");
        stack.push("Thingamajig 7");
        stack.push("Thingamajig 8");
        stack.push("Thingamajig 9");
        stack.push("Thingamajig 10");
        System.out.println("Is stack full? " + stack.isFull());
        System.out.println();
    }

    public static void testSize() {
        System.out.println("-- TESTING SIZE --");
        Stack stack = new StackImpl();
        stack.push("Thingamajig 1");
        stack.push("Thingamajig 2");
        System.out.println("Stack size: " + stack.size());
        System.out.println();
    }

    public static void testPeek() {
        System.out.println("-- TESTING PEEK --");
        Stack stack = new StackImpl();
        stack.push("Thingamajig 1");
        stack.push("Thingamajig 2");
        System.out.println("Top element: " + stack.peek());
        System.out.println();
    }

    public static void testSetCapacity() {
        System.out.println("-- TESTING SETCAPACITY --");
        Stack stack = new StackImpl();
        stack.setCapacity(15);
        System.out.println("Stack capacity updated to 15");
        System.out.println();
    }

    public static void testDisplay() {
        System.out.println("-- TESTING DISPLAY --");
        Stack stack = new StackImpl();
        stack.push("Thingamajig 1");
        stack.push("Thingamajig 2");
        stack.push("Thingamajig 3");
        stack.display();
        System.out.println();
    }
}
