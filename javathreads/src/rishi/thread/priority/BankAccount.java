/**
 * 
 */
package rishi.thread.priority;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Rishikesh
 *
 */
public class BankAccount implements Runnable {
	ReentrantLock lock = new ReentrantLock();
	private int balance;
	public void setBalance(int balance) {
		this.balance = balance;		
	}
	
	public void run() {
		makeWithdrawal(20);
		if (balance < 0) {
			System.out.println("Money overdrawn!!!");
		}
	}	

	private void makeWithdrawal(int amount) {
		System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
		boolean allowWithdrawal = false;
		
		try {
			lock.lock();
			if (balance >= amount) {
				balance -= amount;
				allowWithdrawal = true;			
			} 
		} finally {
			lock.unlock();
		}
		if(allowWithdrawal) {
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " ruppes");
		}
		else {
	    	System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
	    }
	}

}
