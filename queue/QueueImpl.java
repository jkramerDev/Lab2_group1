package queue;

public class QueueImpl implements Queue {

	int LENGTH = 5;
	String[] arr = new String[LENGTH];
	int size = 0;

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
	public String deQueue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

}
