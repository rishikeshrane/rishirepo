/**
 * 
 */
package ordermatcher;

/**
 * @author Rishikesh
 *
 */
public abstract class Order {

	private int price;
	private int volume;
	
	public abstract int getType();
	
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	/*
	 * @Override public int hashCode() { return super.hashCode() + volume + price; }
	 */

	
	
	@Override
	public boolean equals(Object obj) {
		Order o = (Order) obj;
		return o.getPrice() == this.getPrice() && o.getVolume() == this.getVolume();
		// return true;
	}
	 
	@Override
	public String toString() {
		return getType() == 1 ? "SELL " + getVolume() + "@" + getPrice() : "BUY " + getVolume() + "@" + getPrice();
	}
}
