
public class Manager extends Employee {
	public Manager(String name, int salary, String department) {
		super(name,salary);
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager: " + name +  " Department: " + department + " Salary: "+salary;
	}

	String department;
	
}
