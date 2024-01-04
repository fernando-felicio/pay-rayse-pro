package entities;

public class Employee {
	
	private String id;
	private String name;
	private Double salary; // Wrapper class if it is not necessary to assign salary to the employee
	
	public Employee() {
		return;
	}
	
	public Employee(String id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
