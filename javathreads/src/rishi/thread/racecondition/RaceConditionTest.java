/**
 * 
 */
package rishi.thread.racecondition;

/**
 * @author Rishikesh
 *
 */
public class RaceConditionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   BankAccount task = new BankAccount();
		   task.setBalance(100);
		   
		   Thread john = new Thread(task);
		   Thread anita = new Thread(task);	   
		   john.setName("John");
		   anita.setName("Anita");
		   john.start();
		   anita.start();	   
		}

}
