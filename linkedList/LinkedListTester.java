package linkedList;

public class LinkedListTester {
	
	public static LinkedListImpl list = new LinkedListImpl();

	public static void main(String[] args) {
		
		TEST_ADD();
		TEST_DELETE();
		TEST_INLIST();
		TEST_ITEMCOUNT();
		
		
	}
	public static void TEST_ADD() {
		System.out.println("--TESTING ADD--");
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("eight");
		list.add("nine");
		list.add("ten");
		
		list.listItems();
		System.out.println("");
	}
	public static void TEST_DELETE() {
		System.out.println("--TESTING DELETE--");
		list.delete("two");
		list.delete("four");
		list.delete("eight");
		
		list.listItems();
		System.out.println("");
	}
	public static void TEST_INLIST() {
		System.out.println("--TESTING INLIST--");
		
		String item1 = "one";
		String item2 = "eleven";
		
		
		boolean bool = list.isItemInList(item1);
		if (bool) {
			System.out.println("Item found in list: ('" + item1 + "')");
		}
		else {
			System.out.println("Item not found in list: ('" + item1 + "')");
		}
		bool = list.isItemInList(item2);
		if (bool) {
			System.out.println("Item found in list: ('" + item2 + "')");
		}
		else {
			System.out.println("Item not found in list: ('" + item2 + "')");
		}
		
		System.out.println("");
	}
	public static void TEST_INSERTBEFORE() {
		System.out.println("--TESTING INSERTBEFORE--");
	}
	public static void TEST_INSERTAFTER() {
		System.out.println("--TESTING INSERTAFTER--");
	}
	public static void TEST_ITEMCOUNT() {
		System.out.println("--TESTING ITEMCOUNT--");
		System.out.println("List contains (" + list.itemCount() + ") Items");
	}
}