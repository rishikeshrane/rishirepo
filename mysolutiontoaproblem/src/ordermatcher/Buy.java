/**
 * 
 */
package ordermatcher;

/**
 * @author Rishikesh
 *
 */
public class Buy extends Order implements Comparable<Order> {
	private int type = 2;

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	@Override
	public int compareTo(Order o) {
		int a = 1;
		if (getPrice() < o.getPrice()) {
			a = 1;
		} else if (getPrice() > o.getPrice()) {
			a = -1;
		} else if(getPrice() == o.getPrice() && getVolume() == o.getVolume()) {
			a = 0;
		}
		return a;
	}

}
