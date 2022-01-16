/**
 * 
 */
package collection.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Rishikesh
 *
 */
public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Function <String, String> f = (String s) ->  {return s.toUpperCase();};
		Consumer<String> c = System.out::println;
		Predicate<String> p = (s) -> { return s.startsWith("H");};
		
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("How");
		list.add("Are");
		list.add("You");
		list.add("Friends");
		
		list.forEach(s->System.out.println(s));
		//list.forEach(s->f.apply(s));
		list.forEach(s->c.accept(s));
		
		long cnt = list.stream().count();
		System.out.println(cnt);
		
		List<String> sortedList = list.stream().filter(p.negate()).map(f).sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		List<String> sortedList1 = list.stream().filter(p).map(f).sorted().collect(Collectors.toList());
		System.out.println(sortedList1);
	}

}
