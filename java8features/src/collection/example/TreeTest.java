/**
 * 
 */
package collection.example;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * @author Rishikesh
 *
 */
public class TreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Consumer<Integer> con = s->System.out.print(s +" ");
		Map<Integer, String> map = new TreeMap<>();
		Set<Integer> set = new TreeSet<>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		
		map.forEach(PrintMap::println);
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5);
		
		//set.stream().forEach(System.out::print);
		set.stream().forEach(con);
	}
	
	

}

class PrintMap {
	public static void println(Integer a, String s) {
		System.out.println("key :" + a + " Value :" + s);
	}
}
