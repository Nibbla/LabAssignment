
public class Employee {

	protected int salary;
	protected String name;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		return "Employee: " + name + " Salary: " + salary;
	}

}
