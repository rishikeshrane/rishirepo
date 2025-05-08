/**
 * 
 */
package com.myjava.immutableJclass;

/**
 * @author Rishikesh
 *
 */
public final class Employee {
	private int id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	
	public String toString() {
		return "Employee: id=" +id +" name=" + name + " salary=" + salary;
	}
	
	public Employee intEmpSal(Double sal) {
		double intSal = this.getSalary() + sal;
		Employee e1 = new Employee(this.getId(), this.getName(), intSal);
		return e1;
	}

}
