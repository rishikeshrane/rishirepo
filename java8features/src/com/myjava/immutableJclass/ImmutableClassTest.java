/**
 * 
 */
package com.myjava.immutableJclass;

/**
 * @author Rishikesh
 *
 */
public class ImmutableClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee e = new Employee(1,"John", 10000d);
		System.out.println(e);
		
		Employee e1 = e.intEmpSal(100d);
		
		System.out.println(e);
		
		System.out.println(e1);
	}

}
