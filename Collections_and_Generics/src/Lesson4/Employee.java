package Lesson4;

public class Employee implements Comparable<Employee> {

	String name;
	int salary;
	String department;
	
	
	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}



	@Override
	public int compareTo(Employee arg0) {
		if(salary<arg0.salary) {
			return -1;
		}
		else if(salary> arg0.salary) {
			return 1;
		}
		return 0;
	}
	
	
}
