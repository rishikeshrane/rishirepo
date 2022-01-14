/**
 * 
 */
package mysolutiontoaproblem.strings;

/**
 * @author Rishikesh
 * Problem: Reverse a given String
 * Solution: reverse string using recursive function
 */
public class ReverseAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String inputStr = "this is reversed string";
		String revStr = "";
		revStr = reverse(inputStr, revStr);
		System.out.println(revStr);
	}
	
	/***
	 * reverse a input string
	 * @param inputStr
	 * @param revStr
	 * @return
	 */
	static String reverse(String inputStr, String revStr) {
		if(inputStr.length() == 0) return "";
		
		revStr = inputStr.charAt(0) +"" + revStr;
		if(inputStr.length() == 1) return revStr;
		
		return reverse(inputStr.substring(1), revStr);
	}

}
