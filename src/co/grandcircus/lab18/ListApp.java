package co.grandcircus.lab18;

public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyLinkedList();
		test(list);
//		list = new MyArrayList();
//		test(list);
	}

	private static void test(MyList list) {
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
//		list.removeFromBeginning();
//		list.removeFromEnd();
		list.insertAt(3, "Z");
		list.insertAt(2, "Y");
		list.insertAt(0, "X");
		list.insertAt(list.size(), "Q");
//		list.remove(1);
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}

}
