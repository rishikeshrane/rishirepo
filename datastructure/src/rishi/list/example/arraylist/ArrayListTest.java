/**
 * 
 */
package rishi.list.example.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author Rishikesh
 *
 */
public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(30);
		list.add(32);
		list.add(34);
		
		Function<Integer, Integer> f = (Integer s)-> {return s*2;};
				
		//Function <String, String> f = (String s) ->  {return s.toUpperCase();};
		
		Optional<Integer> y = list.stream().reduce((a, b) -> (a > b) ? a : ((a == b) ? 0 : b)).filter(s->s%2==0).map(f);
		y.ifPresent(a->System.out.println(y));
		
		Optional<Integer> z = list.stream().reduce((a, b) -> a+b);//.filter(s->s%2==0).map(f);
		z.ifPresent(a->System.out.println(z));
		
		//.forEach(s->System.out.println(s));
		
	}

}
