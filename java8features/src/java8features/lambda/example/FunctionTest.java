/**
 * 
 */
package java8features.lambda.example;

import java.util.function.Function;

/**
 * @author Rishikesh
 *
 */
public class FunctionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Function<String, String> toUpper = (String str) -> str.toUpperCase();
		String upperCase = toUpper.apply("Hello Lambda.");
		System.out.println("UpperCase Result :" + upperCase);
	}

}
