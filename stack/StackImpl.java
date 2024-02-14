package stack; 

public class StackImpl implements Stack {

	private String [] elements;
	private int top = -1;
	private int size;
	
	
	@Override
	public void push(String el) {
		if (isFull()) {
			System.err.println("full stack");
		}
		else {
			top++;
			elements[top] = el;
		}
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isFull() {
		return top == size - 1;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCapacity(int s) {
		elements = new String[s];
		size = s;
		
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
 

}
