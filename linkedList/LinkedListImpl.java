package linkedList;

public class LinkedListImpl implements LinkedList {

	ListItem head;
	
	public LinkedListImpl() {
		
	}
	
	@Override
	public Boolean isItemInList(String item) {
		ListItem current = head;
		
		if (current == null) {
			return false;
		}
		
		while (current != null) {
			if (current.data == item) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public void add(String item) {
		
		if (head == null) {
			head = new ListItem(item);
			return;
		}
		else {
			ListItem current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListItem(item);
		}
	}

	@Override
	public Integer itemCount() {
		int count = 0;
		ListItem current = head;
		if (head == null) {
			return count;
		}
		count++;
		while (current.next != null) {
			current = current.next;
			count++;
		}
		return count;
	}

	@Override
	public void listItems() {
		ListItem current = head;
		System.out.print("[");
		while (current != null) {
			System.out.print(current.data);
			current = current.next;
			if (current != null) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	@Override
	public void delete(String item) {
		if (isItemInList(item) == false) {
			System.out.println("Could not find selected item to delete: ('" + item + "')");
			return;
		}
		if (head == null)
			return;
		if (head.data == item) {
			head = head.next;
			return;
		}
		ListItem current = head;
		while (current.next != null) {
			if (current.next.data == item) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
		
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		if (head == null)
        return false;

    	if (head.data.equals(itemToInsertBefore)) {
        ListItem newItemNode = new ListItem(newItem);
        newItemNode.next = head;
        head = newItemNode;
        return true;
    	}

    	ListItem current = head;
    	while (current.next != null) {
        	if (current.next.data.equals(itemToInsertBefore)) {
            ListItem newItemNode = new ListItem(newItem);
            newItemNode.next = current.next;
            current.next = newItemNode;
            	return true;
        	}
        	current = current.next;
    	}
    	return false;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		ListItem current = head;
    	while (current != null) {
        	if (current.data.equals(itemToInsertAfter)) {
            	ListItem newItemNode = new ListItem(newItem);
            	newItemNode.next = current.next;
            	current.next = newItemNode;
            	return true;
        	}
        	current = current.next;
    	}
    	return false;
	}

	@Override
	public void sort() {
		if (head == null || head.next == null)
        	return;

    	ListItem current = head;
    	while (current != null) {
        	ListItem index = current.next;
        	while (index != null) {
            	if (current.data.compareTo(index.data) > 0) {
                	String temp = current.data;
                	current.data = index.data;
                	index.data = temp;
            	}
            	index = index.next;
        	}
        	current = current.next;
    	}
	}
	
}