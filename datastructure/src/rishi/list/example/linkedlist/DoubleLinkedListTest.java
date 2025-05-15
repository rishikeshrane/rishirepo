/**
 * 
 */
package rishi.list.example.linkedlist;

/**
 * @author Rishikesh
 *
 */
public class DoubleLinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DoubleLinkedList d = new DoubleLinkedList();
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		
		d.printDLinkedList();
		System.out.println();
		d.printDLinkedListReverse();
		
		Node b = d.delete(1);
		if(b == null) 
			System.out.println("\nNo such a element or list is empty.");
		else
			System.out.println("\n" + b.getValue());
		//d.printDLinkedListReverse();
		d.printDLinkedList();
	}

}
