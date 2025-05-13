/**
 * 
 */
package java8features.lambda.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Rishikesh
 *
 */
public class AllinOneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Predicate<Integer> p = (Integer i) -> { return i > 0; };
		Predicate<Integer> p1 = (i) ->  i > 0;
		Predicate<Integer> p2 = i -> i > 0;

		Function<String, String> toUpper = (String str) -> {return str.toUpperCase();};
		
		Consumer<String> consumer = (name) -> {System.out.println("Hi " + name);};
		Consumer<String> consumer1 = (name) -> System.out.println("Hello " + name);
		Consumer<String> consumer2 = (name -> {System.out.println("How are you " + name);});
		Consumer<String> consumer3 = name -> System.out.println("Good Day " + name);
		Consumer<String> consumer4 = System.out::println; //method reference
		
		System.out.println(p1.test(7));
		System.out.println(toUpper.apply("Rishikesh"));
		consumer.accept("Rishi");
		
	}

}
