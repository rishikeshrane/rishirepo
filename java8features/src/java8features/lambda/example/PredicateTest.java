/**
 * 
 */
package java8features.lambda.example;

import java.util.function.Predicate;

/**
 * @author Rishikesh
 *
 */
public class PredicateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Predicate<Integer> p = (Integer i) -> { return i > 0; };
		Predicate<Integer> p1 = (i) ->  i > 0;
		Predicate<Integer> p2 = i -> i > 0;
		
		System.out.println(p.test(1));
		System.out.println(p1.test(0));
		System.out.println(p2.negate().test(1));
	}

}
