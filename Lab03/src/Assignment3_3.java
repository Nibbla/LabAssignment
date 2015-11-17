
public class Assignment3_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e = new Employee("Hans",400);
		Manager m = new Manager("Hans2",4000,"Housing");
		Executive ex = new Executive("Hans2",4000,"Housing");
		
		System.out.println(e.toString());
		System.out.println(m.toString());
		System.out.println(ex.toString());
	}

}
