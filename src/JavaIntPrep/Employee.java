package JavaIntPrep;

public class Employee {
	
	private String name;
	private int age;
	private int salary;
	private String department;
	private String city;

	
	public Employee() {
		super();
		
	}

	public Employee(String name, int age, int salary, String department, String city) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + ", city=" + city + "]";
	}
	
	
	
	

}
