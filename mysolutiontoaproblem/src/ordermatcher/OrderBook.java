/**
 * 
 */
package ordermatcher;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @author Rishikesh
 *
 */
public class OrderBook {
	
	private Consumer<Order> sellOrder = o -> System.out.println("SELL " + o.getVolume() + "@" + o.getPrice());
	private Consumer<Order> buyOrder = o -> System.out.println("BUY " + o.getVolume() + "@" + o.getPrice());
	
	private static Set<Order> sellOrderList = new TreeSet<>();
	
	private static Set<Order> buyOrderList = new TreeSet<>();
	
	public void matchOrder(Order order) {
		if(1 == order.getType()) {
			if(buyOrderList.size() > 0) {
				int price = order.getPrice();
				int volume = 0;
				int finalVol=0;
				List<Order> mo = buyOrderList.stream().filter(o -> o.getPrice() >=price).collect(Collectors.toList());
				for(int i=0; i<mo.size(); i++) {
					Order o = mo.get(i);
					volume = order.getVolume();
					if(volume > 0 && volume > o.getVolume()) {
						finalVol = volume - o.getVolume();
						System.out.println("TRADE " + o.getVolume() + "@" + o.getPrice());
						boolean w = buyOrderList.remove(o);
						System.out.println("Order " + o + " removed:" + w);
						order.setVolume(finalVol);
					} else if (volume > 0 && volume < o.getVolume()) {
						finalVol = o.getVolume() - volume;
						System.out.println("TRADE " + volume + "@" + o.getPrice());
						o.setVolume(finalVol);
						order.setVolume(0);
					} else if(volume > 0) {
						System.out.println("TRADE " + volume + "@" + o.getPrice());
						boolean w = buyOrderList.remove(o);
						System.out.println("Order " + o + " removed:" + w);
					}
				}
				if(order.getVolume() > 0) {
					addOrder(order);
				}
				
			} else {
				addOrder(order);
			}
		} else {
			if(sellOrderList.size() > 0) {
				int price = order.getPrice();
				int volume = 0;
				int finalVol=0;
				List<Order> mo = sellOrderList.stream().filter(o -> o.getPrice() <=price).collect(Collectors.toList());
				for(int i=0; i<mo.size(); i++) {
					Order o = mo.get(i);
					volume = order.getVolume();
					if(volume > 0 && volume > o.getVolume()) {
						finalVol = volume - o.getVolume();
						System.out.println("TRADE " + o.getVolume() + "@" + o.getPrice());
						boolean w = sellOrderList.remove(o);
						System.out.println("Order " + o + " removed:" + w);
						order.setVolume(finalVol);						
					} else if (volume > 0 && volume < o.getVolume()) {
						finalVol = o.getVolume() - volume;
						System.out.println("TRADE " + volume + "@" + o.getPrice());
						o.setVolume(finalVol);
						order.setVolume(0);
					} else if(volume > 0) {
						System.out.println("TRADE " + volume + "@" + o.getPrice());
						boolean w = sellOrderList.remove(o);
						System.out.println("Order " + o + " removed:" + w);
					}
				}
				if(order.getVolume() > 0) {
					addOrder(order);
				}
				
			} else {
				addOrder(order);
			}
		}
	}
	
	public void addOrder(Order order) {
		if(1 == order.getType()) {
			sellOrderList.add(order);
		}
		else {
			buyOrderList.add(order);
		}
	}
	
	public void printOrder() {
		System.out.println("---------------SELL-------------");
		sellOrderList.forEach(sellOrder);
		
		System.out.println("---------------BUY-------------");
		buyOrderList.forEach(buyOrder);		
	}
}
