/**
 * 
 */
package strings;

/**
 * @author Rishikesh
 *
 */
public class TypedOutString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s ="x#y#z#a"; //ab#c
		String t= "a#A";//az#c
		
		boolean a = typedOut(s).equals(typedOut(t));
		System.out.println("Typed String are equel:" + a);
		System.out.println("typed out String is:"+typedOut("a###b"));//ab##
	}
	
	public static String typedOut(String str) {
		if (null == str || "".equals(str))
			return str;
		if (!str.contains("#"))
			return str;

		int index = str.indexOf("#");
		String typedOutStr="";
		if(index > 0) {
			typedOutStr = str.substring(0, index - 1);
		}
		if (str.length() > index + 1) {
			typedOutStr = typedOutStr.concat(str.substring(index+1));

		}
		
		return typedOut(typedOutStr);
	}

}
