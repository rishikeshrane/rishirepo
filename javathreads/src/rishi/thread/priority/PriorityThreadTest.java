/**
 * 
 */
package rishi.thread.priority;

/**
 * @author Rishikesh
 *
 */
public class PriorityThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   BankAccount task = new BankAccount();
		   task.setBalance(100);
		   
		   Thread john = new Thread(task);
		   Thread anita = new Thread(task);	   
		   Thread mark = new Thread(task);
		   Thread steve = new Thread(task);
		   Thread sally = new Thread(task);
		   Thread olga = new Thread(task);
		   
		   john.setName("John");
		   anita.setName("Anita");
		   mark.setName("Mark");
		   steve.setName("Steve");
		   sally.setName("Sally");
		   olga.setName("Olga");
		   
		   john.setPriority(Thread.MIN_PRIORITY);
		   anita.setPriority(Thread.MIN_PRIORITY);
		   mark.setPriority(Thread.MAX_PRIORITY);
		   steve.setPriority(Thread.NORM_PRIORITY);
		   sally.setPriority(Thread.NORM_PRIORITY);
		   olga.setPriority(Thread.MAX_PRIORITY);
		   
		   john.start();
		   anita.start();
		   mark.start();
		   steve.start();
		   sally.start();
		   olga.start();
		}

}
