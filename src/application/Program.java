package application;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import entities.Employee;
import java.util.List;


public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		int qtdEmployees = scanner.nextInt();
		
		List <Employee> listEmployees = new ArrayList<>();
		
		for (int i = 0; i < qtdEmployees; i ++ ) {			
			
			
			System.out.println("Employee #" + (i +1));
			
			System.out.print("ID: ");
			Integer id = scanner.nextInt();
			
			
			
			while (hasId(listEmployees, id)) {
				System.out.println("This id already exist");
				id = scanner.nextInt();				
			}
			
			System.out.print("Name: ");	
			scanner.nextLine();
			String name = scanner.nextLine();		
			
			System.out.print("Salary: ");
			Double salary = scanner.nextDouble(); // Wrapper class if it is not necessary to assign salary to the employee
			
			Employee employe = new Employee(id, name, salary);
			
			listEmployees.add(employe);
		}
		
		
		System.out.println();
		System.out.print("Enter the employee ID that will have salary increase: ");
		int idSalary = scanner.nextInt();
		
		Employee position = listEmployees.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if (position == null) {
			System.out.println("This id does not exist");
		}else {		
		System.out.print("Enter the percentage: ");
		Double percentage = scanner.nextDouble();
		position.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		System.out.println();
		
		for (Employee x : listEmployees) {
			System.out.println(x);
		}
		
		
		
		scanner.close();
		
		
	}
	
	public static Boolean hasId(List<Employee> list, int id) {
		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employee != null;
	}
		
	}


