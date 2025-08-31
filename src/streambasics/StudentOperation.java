package streambasics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentOperation {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				
				new Student("Alice", 87, "A"),
				new Student("Bob", 75, "D"),
				new Student("Peter", 69, "B"),
				new Student("Kevin", 82, "D"),
				new Student("David", 93, "C"),
				new Student("Ben", 78, "B"),
				new Student("Andrew", 60, "C"),
				new Student("Smith", 71, "A"),
				new Student("Mike", 70, "C"),
				new Student("Watson", 81, "A"),
				new Student("Bobby", 66, "A")
				
				);
		
		Map<String, List<Student>> studentsMap = students.stream().collect(Collectors.groupingBy(s -> s.getMarks() >= 75 ? "Distinction" : "First Class"));
		System.out.println(studentsMap);
		
		//filter avg marks of students from div 'A' 
		Double avgMarks = students.stream().filter(s -> s.getDiv().equalsIgnoreCase("A"))
				.map(s -> s.getMarks()).mapToDouble(s -> s).average().getAsDouble();
		System.out.println(avgMarks);
		
		
	}

}
