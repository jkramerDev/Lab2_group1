package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {

		LinkedList stations = new LinkedListImpl();

        System.out.println("-----L I S T  T E S T------");
		
		

		// Create 4 stations
        stations.add("Station A");
        stations.add("Station B");
        stations.add("Station C");
        stations.add("Station D");

        // List the stations
        System.out.println("List of stations:");
        stations.listItems();
        System.out.println();

        // Check if a station is in the list
        String stationToCheck = "Station B";
        System.out.println("Checking if '" + stationToCheck + "' is in the list:");
        if (stations.isItemInList(stationToCheck)) {
            System.out.println(stationToCheck + " is in the list.");
        } else {
            System.out.println(stationToCheck + " is not in the list.");
        }
        System.out.println();

        // Check for a station that exists, and one that doesn’t
        String existingStation = "Station C";
        String nonExistingStation = "Station E";
        System.out.println("Checking for existing station '" + existingStation + "' in the list:");
        if (stations.isItemInList(existingStation)) {
            System.out.println(existingStation + " is in the list.");
        } else {
            System.out.println(existingStation + " is not in the list.");
        }
        System.out.println("Checking for non-existing station '" + nonExistingStation + "' in the list:");
        if (stations.isItemInList(nonExistingStation)) {
            System.out.println(nonExistingStation + " is in the list.");
        } else {
            System.out.println(nonExistingStation + " is not in the list.");
        }
        System.out.println();

        // Remove a station
        String stationToRemove = "Station C";
        System.out.println("Removing station '" + stationToRemove + "' from the list.");
        stations.delete(stationToRemove);

        // List the stations
        System.out.println("List of stations after removal:");
        stations.listItems();
        System.out.println();

        // Add a station before another station
        String stationToAdd = "Station X";
        String stationToAddBefore = "Station B";
        System.out.println("Adding station '" + stationToAdd + "' before station '" + stationToAddBefore + "'.");
        stations.insertBefore(stationToAdd, stationToAddBefore);

        // List the stations
        System.out.println("List of stations after adding:");
        stations.listItems();
        System.out.println();

        // Add a station after another station
        String stationToAddAfter = "Station Y";
        String stationToAddAfterStation = "Station D";
        System.out.println("Adding station '" + stationToAddAfter + "' after station '" + stationToAddAfterStation + "'.");
        stations.insertAfter(stationToAddAfter, stationToAddAfterStation);

        // Print the stations
        System.out.println("List of stations after adding:");
        stations.listItems();

		System.out.println("----Q U E U E  T E S T-------");
		
		Queue riders = new QueueImpl();
		//create 6 riders
		riders.enQueue("rider1");
		riders.enQueue("rider2");
		riders.enQueue("rider3");
		riders.enQueue("rider4");
		riders.enQueue("rider5");
		riders.enQueue("rider6");
		
		//peek at queue, print result
		System.out.println("Queue Head: " + riders.peek());
		
		//remove head and print all
		riders.deQueue();
		riders.display();
		
		//add 2 more riders
		riders.enQueue("rider7");
		riders.enQueue("rider8");
		
		//peek and print
		System.out.println("Queue Head: " + riders.peek());
		
		//remove head and print all
		riders.deQueue();
		riders.display();
		
		//iterate and print all
		riders.display();
		
		System.out.println("-----S T A C K  T E S T------");
		
		Stack onBus = new StackImpl();
		
		//push 6 people to stack and print all
		onBus.push("person1");
		onBus.push("person2");
		onBus.push("person3");
		onBus.push("person4");
		onBus.push("person5");
		onBus.push("person6");
		
		onBus.display();
		
		//peek and print
		System.out.println("Top of Stack: " + onBus.peek());
		
		//push 2 more people
		onBus.push("person7");
		onBus.push("person8");
		
		//peek and print
		System.out.println("Top of Stack: " + onBus.peek());
		
		//remove all people
		while (!onBus.isEmpty()) {
			onBus.pop();
		}
		
		//verify all people are off the bus
		System.out.println("Is the bus empty: " + onBus.isEmpty());
	 	}

}
