/**
 * 
 */
package rishi.thread.lock;

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
		//makeSyncWithdrawal(75);
		//makeSyncBlockWithdrawal(75);
		makeWithdrawalUsingLock(75);
		if (balance < 0) {
			System.out.println("Money overdrawn!!!");
		}
	}	

	private synchronized void  makeSyncWithdrawal(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " rupees");
	    } else {
	    	System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
	    }
	}	

	private void  makeSyncBlockWithdrawal(int amount) {
		System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
		boolean allowWithdrawal = false;
		synchronized (this) {
			if (balance >= amount) {
				allowWithdrawal = true;
				balance -= amount;
			}
		}
		if(allowWithdrawal) {
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " rupees");
	    } else {
	    	System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
	    }
	}	

	private void  makeWithdrawalUsingLock(int amount) {
		System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
		boolean allowWithdrawal = false;
		try {
		lock.lock();
			if (balance >= amount) {
				allowWithdrawal = true;
				balance -= amount;
			}
		
		} finally {
			lock.unlock();
		}
		if(allowWithdrawal) {
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " rupees");
	    } else {
	    	System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
	    }
	}

}
