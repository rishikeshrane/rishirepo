/**
 * 
 */
package collection.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author Rishikesh
 *
 */
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//BiFunction<Long, String, String> b = (m, n) -> { return (m+ " :" + n); };
		BiConsumer<Long, String> b = (m, n) -> { System.out.println(m + ":" + n); };
		
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(1l, "One");
		map.put(2l, "Two");
		map.put(3l, "Three");
		map.put(4l, "Four");
		map.put(5l, "Five");
		
		map.forEach((m, n) -> {System.out.println(m+ " :" + n);});
		map.forEach(b);
	}

}
