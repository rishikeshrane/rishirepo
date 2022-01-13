/**
 * 
 */
package java8features.lambda.example;

import java.util.function.Consumer;

/**
 * @author Rishikesh
 *
 */
public class ConsumerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Consumer<String> consumer = (name) -> {System.out.println("Hi " + name);};
		Consumer<String> consumer1 = (name) -> System.out.println("Hello " + name);
		Consumer<String> consumer2 = (name -> {System.out.println("How are you " + name);});
		Consumer<String> consumer3 = name -> System.out.println("Good Day " + name);
		Consumer<String> consumer4 = System.out::println; //method reference
		
		consumer.accept("Rishikesh");
		consumer1.accept("Rishikesh");
		consumer2.andThen(consumer).accept("Rishikesh");
		consumer3.accept("Rishikesh");
		consumer4.accept("Rishikesh");
	}

}
