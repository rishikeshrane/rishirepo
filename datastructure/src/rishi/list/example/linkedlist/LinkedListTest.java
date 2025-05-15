/**
 * 
 */
package rishi.list.example.linkedlist;

import java.util.LinkedList;

/**
 * @author Rishikesh
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		
		list.stream().filter(p-> p%2==0).map(i->i*2).forEach(s->System.out.println(s));
		
		
	}

}
