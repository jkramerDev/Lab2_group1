package linkedList;
 
 

public interface LinkedList {
	public Boolean isItemInList(String Item);
		// true if it is, false if not
	public void add(String Item);
		// true if added, false if it was already there, or an error
	public Integer itemCount();
	public void listItems(); 
	public void delete(String Item);
		// true if deleted, false if not there or error
	public Boolean insertBefore(String newItem, String itemToInsertBefore);
	public Boolean insertAfter(String newItem, String itemToInsertAfter);
	
	
	
	//EC
	public void sort();
		// ascending alphanumeric sort; nothing fancy but ALTERS THE LIST, DOES NOT COPY.
}

// Implement this interface using class ListItem
//  Also implement the tester in this package.