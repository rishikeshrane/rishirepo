/**
 * 
 */
package collection.example;

/**
 * @author Rishikesh
 *
 */
public class Employee {
	int id;
	String name;
	Double salary;
	
	Employee () {
		
	}
	
	public Employee (int id, String name, Double salary) {
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
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}