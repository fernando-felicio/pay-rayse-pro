package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary; // Wrapper class if it is not necessary to assign salary to the employee
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
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
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	public void increaseSalary(double percentage) {
		this.salary += (this.salary * percentage / 100);
	}
	

}
