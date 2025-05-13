/**
 * 
 */
package rishi.list.example.linkedlist;

/**
 * @author Rishikesh
 *
 */
public class SingleLinkedList {
	private Node node = null;
	private Node root = null;
	
	public Node add(int a) {
		Node n;
	 if(root == null) {
		 n = new Node();
		 n.value = a;
		 n.next = null;
		 root = n;
	 } else {
		 	 
		 n = new Node();
		 n.setValue(a);
		 n.next = null;		 
		 
		 for (node = root; node.next != null; node = node.next);
		 node.next = n;
	 }
		return n;
	}
	
	public void printList() {
		for (node = root; node != null; node = node.next)
			System.out.print(" " + node.getValue());
	}
	
	public Node delete(int a) {
		Node n = root;
		
	 if(n == null) {
		 System.out.println("List is empty, nothing to delete");
		 
	 } else { 
		 
		 for (node = root; node != null; node = node.next) {
			 
			 if(node.getValue() == a) {
				 if(root == node) 
					 root = node.next;
				 else
					 n.next = node.next;
				 return node;
			 }
			 
			 n = node;
		 }
		 
	 }
		return null;
	}

}
