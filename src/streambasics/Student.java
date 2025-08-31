package streambasics;

public class Student {
	
	private String name;
	private int marks;
	private String div;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int marks, String div) {
		super();
		this.name = name;
		this.marks = marks;
		this.div = div;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", div=" + div + "]";
	}
	
	

}
