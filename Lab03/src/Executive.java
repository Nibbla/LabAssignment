
public class Executive extends Manager {

	public Executive(String name, int salary, String department) {
		super(name, salary, department);
		
	}
	
	public String toString(){
		String s = super.toString();
		s=s.replaceAll("Manager", "Executive");
		return s;
	}

}
