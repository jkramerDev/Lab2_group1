package stack; 

public class StackImpl implements Stack {

	private String [] elements = new String[10];
	private int top = -1;
	private int size = 10;


	@Override
	public void push(String s) {
	
		if (isFull())
			System.err.println("Stack is full");
		else
		{
			top++;
			elements[top] = s;
	
		}
	
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            System.err.println("Stack is empty");
            return null;
        } else {
            String poppedElement = elements[top];
            elements[top] = null;
            top--;
            return poppedElement;
        }
	}

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		return top == size - 1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top + 1;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            System.err.println("Stack is empty");
            return null;
        } else {
            return elements[top];
        }
	}

	@Override
	public void setCapacity(int size) {
		// TODO Auto-generated method stub
		if (size < this.size) {
            System.err.println("Nah bro pick a bigger number");
        } else {
            String[] newElements = new String[size];
            System.arraycopy(elements, 0, newElements, 0, this.size);
            elements = newElements;
            this.size = size;
        }
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(elements[i]);
            }
        }
	}
 

}
