/**
 * 
 */
package rishi.list.example.linkedlist;

/**
 * @author Rishikesh
 *
 */
public class DoubleLinkedList {
	private Node root;
	private Node node;
	private Node last;
	
	public Node add(long value) {
		Node n = null;
		if(root == null) {
			n = new Node();
			n.setValue(value);
			n.next = null;
			n.prev = null;
			root = n;
			last = root;
		} else {
			n = new Node();
			n.setValue(value);
			n.next = null;
			
			for(node = root; node.next != null; node = node.next);
			node.next = n;
			n.prev = node;
			last = n;
		}
		return n;
	}
	
	public void printDLinkedList() {
		for(node = root; node != null; node = node.next)
			System.out.print(node.getValue() + " ");
	}
	
	public void printDLinkedListReverse() {
		for(node = last; node != null; node = node.prev) {
			System.out.print(node.getValue() + " ");
		}
	}
	
	public Node delete(int a) {
		Node n = root;
		for(Node node = root; node != null; node = node.next) {
			
			if(node.getValue() == a) {
				
				if(node == root) {
					root = node.next;
					node.next.prev = root;
					root.prev = null;
				} else {
					n.next = node.next;
					if(node.next == null) {
						last = n;
					} else
					node.next.prev = n;
				}
				return node;
			}
			n = node;
		}
		return null;
	}

}
