/**
 * 
 */
package ordermatcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Rishikesh
 *
 */
public class OrderMatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String input = "";//"SELL 100@10";
		
		String order;
		Order newOrder = null;
		
		OrderBook ob = new OrderBook();
		
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				input = br.readLine();
				
				if(input.equalsIgnoreCase("PRINT")) {
					ob.printOrder();
					continue;
				}				
				else if(input.startsWith("SELL")) {
					order = input.substring(5);
					String []split = order.split("@");
					newOrder = new Sell();
					newOrder.setVolume(Integer.valueOf(split[0]));
					newOrder.setPrice(Integer.valueOf(split[1]));
					ob.matchOrder(newOrder);
				} else if(input.startsWith("BUY")){
					order = input.substring(4);
					String []split = order.split("@");
					newOrder = new Buy();
					newOrder.setVolume(Integer.valueOf(split[0]));
					newOrder.setPrice(Integer.valueOf(split[1]));
					ob.matchOrder(newOrder);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while(!"EXIT".equalsIgnoreCase(input));
		
		

		
		
		/*
		 * Order s1 = new Sell(); s1.setVolume(100); s1.setPrice(10); ob.addOrder(s1);
		 * 
		 * Order s2 = new Sell(); s2.setVolume(100); s2.setPrice(55); ob.addOrder(s2);
		 * 
		 * Order s3 = new Sell(); s3.setVolume(500); s3.setPrice(67); ob.addOrder(s3);
		 * 
		 * Order s4 = new Sell(); s4.setVolume(120); s4.setPrice(10); ob.addOrder(s4);
		 * 
		 * Order b1 = new Buy(); b1.setVolume(200); b1.setPrice(17); ob.addOrder(b1);
		 * 
		 * Order b2 = new Buy(); b2.setVolume(100); b2.setPrice(44); ob.addOrder(b2);
		 * 
		 * Order b3 = new Buy(); b3.setVolume(300); b3.setPrice(33); ob.addOrder(b3);
		 * 
		 * Order b4 = new Buy(); b4.setVolume(120); b4.setPrice(17); ob.addOrder(b4);
		 */
		
//		ob.printOrder();
	}

}
