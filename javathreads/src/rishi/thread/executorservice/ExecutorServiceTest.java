/**
 * 
 */
package rishi.thread.executorservice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Rishikesh
 *
 */
public class ExecutorServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(4); 
		   BankAccount task = new BankAccount();
		   task.setBalance(100);
		   
		   Thread john = new Thread(task);
		   Thread anita = new Thread(task);
		   Thread steve = new Thread(task);
		   Thread mark = new Thread(task);
		   Thread sally = new Thread(task);
		   Thread olga = new Thread(task);
		   		   		   
		   pool.submit(olga);
		   pool.execute(anita);
		 //  pool.shutdownNow(); Immediate shutdown
		   pool.submit(john);
		 //  pool.shutdown(); // no more new task will be accepted but will insure accepted task to complete before shutting down
		   pool.execute(steve);
		   //pool.shutdown();
		   pool.execute(mark);
		   pool.execute(sally);
		   
		   pool.shutdown();
		}

}
