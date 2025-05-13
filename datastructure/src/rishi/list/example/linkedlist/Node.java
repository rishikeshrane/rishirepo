/**
 * 
 */
package rishi.list.example.linkedlist;

/**
 * @author Rishikesh
 *
 */
public class Node {
	long value;
	Node next;
	
	/**
	 * @return the value
	 */
	public long getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(long value) {
		this.value = value;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}	

}
