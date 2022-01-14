/**
 * 
 */
package numbers;

/**
 * @author Rishikesh
 * Probleb:Find longest sequence of zeros in binary representation of an integer.
 * Solution: using iterator
 */
public class NumberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String binaryStr = Integer.toBinaryString(32);// 8421 1010 1100100
		int cnt = 0;
		int c = 0;
		int tmp = 0;
		for (int i = 0; i < binaryStr.length(); i++) {
			c = Integer.valueOf(binaryStr.substring(i, i + 1));
			if (c == 1) {
				if (cnt < tmp)
					cnt = tmp;
				tmp = 0;
			}
			if (c == 0 ) {
				tmp = tmp + 1;

			}

		}
		System.out.println("o/p=" + cnt);
	}

}
