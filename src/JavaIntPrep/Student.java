package JavaIntPrep;

public class Student {
	
	private String firstName;
	private String lastName;
	private String city;
	private Double Grade;
	private int age;
	private String Department;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String firstName, String lastName, String city, Double grade, int age, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		Grade = grade;
		this.age = age;
		Department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getGrade() {
		return Grade;
	}

	public void setGrade(Double grade) {
		Grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", Grade=" + Grade
				+ ", age=" + age + ", Department=" + Department + "]";
	}
	
	

}
