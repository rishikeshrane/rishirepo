/**
 * 
 */
package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Rishikesh
 *
 */
public class TestJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(1, "oneone");
		
		System.out.println(map.size());
		System.out.println(map);
		
		if("nifty" instanceof String) {
			System.out.println(true);
		}
		System.out.println("nifty".getClass().getName());
		if("nifty".getClass().getName().equals("String")) {
			System.out.println(true);
		}
		
		ArrayList<String> a = new ArrayList();
		a.add("one");
		a.add("two");
		a.add("three");
		
		a.forEach(System.out::println);
		
		for(Object o: a) {
			System.out.println(o);
		}
		
		
	}

}
