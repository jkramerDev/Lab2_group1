package queue;

public class QueueImpl implements Queue {

	int LENGTH = 5;
	String[] arr = new String[LENGTH];
	int size = 0;
	int front = 0;

	@Override
	public boolean isFull() {
		if (arr[LENGTH - 1] != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (arr[0] == null) {
			return true;
		}
		return false;
	}

	@Override
	public void enQueue(String element) {
		// TODO Auto-generated method stub

		if (isFull()) {
			System.err.println("sorry, full queue");
		} else if (isEmpty()) {
			arr[0] = element;
			size++;
		} else {
			
			//everybody shift one to the 'right'
			for (int i = size; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			
			//last one on 
			arr[0] = element;
			size++;
		}

	}
	
	@Override
	public void deQueue() {
		
		if(isEmpty()){
	          System.out.println("Queue is empty. Nothing to dequeue");
	      } else if (front == size){
	          front = size = -1;
	      } else {
	          front++;
	      }
	}

	@Override
	public void display() {
		
		String display = "[";
		
		for (int i = front; i < LENGTH; i++) {
			display += arr[i];
			if (i == LENGTH - 1)
				break;
			display += ", ";
		}
		
		display += "]";
		
		System.out.println("Queue Display: " + display);
	}

	@Override
	public String peek() {
		
		return arr[front];
		
	}

}
