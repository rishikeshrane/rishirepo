/**
 * 
 */
package rishi.thread.basic.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Rishikesh
 *
 */
public class ThreadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t = new Thread(() -> {System.out.println("This is thread test");});
		t.start();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("This is runnable test");
			}
		};
		
		//r.run();
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Callable<Integer> c = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				System.out.println("This is callable test, returning integer."); 
				return 10+20;
			}
		};
		
		/*
		 * try { Integer a = c.call(); System.out.println(a);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
		
		ExecutorService s = Executors.newFixedThreadPool(2);
		Future<Integer> f = s.submit(c);
		if (f.isDone()) {
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Result not yet ready.");
		}
		try {
			System.out.println(f.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("Result got.. shuting down");
		s.shutdown();
	}

}
