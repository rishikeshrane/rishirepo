/**
 * 
 */
package rishi.list.example.linkedlist;

/**
 * @author Rishikesh
 *
 */
public class SingleLinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SingleLinkedList s = new SingleLinkedList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(-4);
		s.add(5);
		
		s.printList();
		Node p = s.delete(1);
		if(p ==null) {System.out.println(" No such an element in the list. ");}
		else
		System.out.println("\n "+p.getValue() + " deleted.");
		
		s.printList();
	}

}
