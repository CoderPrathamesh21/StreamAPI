package JavaIntPrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudOperations {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("John", "Smith", "Miami", 8.38, 19, "Civil"),
				new Student("Mike", "Miles", "New York", 8.4, 21, "IT"),
				new Student("Michael", "Petersen", "NewYork", 7.5, 20, "Civil"),
				new Student("James", "Robertson", "Miami", 9.1, 20, "IT"),
				new Student("John", "Miller", "Miami", 7.83, 20, "Civil"),
				new Student("Roy", "Raina", "New York", 9.18, 21, "IT"),
				new Student("Beb", "Walker", "Miami", 8.41, 19, "IT")
				);
		
		//1.Find all students from Miami with grade > 8.0
		
		List<Student> list1 = list.stream().filter(e -> e.getGrade() > 8.0 && e.getCity().equalsIgnoreCase("Miami")).collect(Collectors.toList());
		System.out.println(list1);
		
		//2nd way
		list.stream().filter(s -> s.getGrade() > 8.0 && s.getCity().equalsIgnoreCase("Miami")).forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------");
		
		//2.Find the student with highest grade
		
		Optional<Student> topper = list.stream().max(Comparator.comparingDouble(Student::getGrade));
		//System.out.println(topper);
		topper.ifPresent(System.out::println);
		
		//Find out max and min grade
		Double maxGrade = list.stream().mapToDouble(Student::getGrade).max().orElse(0.0);
		System.out.println(maxGrade);
		
		Double minGrade = list.stream().mapToDouble(Student::getGrade).min().orElse(0.0);
		System.out.println(minGrade);
		
		//find students with max grades if in case of more than 1 student having same highest grade
		List<Student> toppers = list.stream().filter(s -> s.getGrade() == maxGrade).collect(Collectors.toList());
		toppers.forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------------");
		
		//3.Count number of students in each department
		Map<String, Long> departmentCount = list.stream().collect(Collectors.groupingBy(s -> s.getDepartment(), Collectors.counting()));
		System.out.println("Numer of students from each department: " + departmentCount);
		
		System.out.println("----------------------------------------------------------------------");
		
		//4.find the average grade per department
		Map<String, Double> avgGrade =  list.stream().collect(Collectors.groupingBy(s -> s.getDepartment(), Collectors.averagingDouble(s -> s.getGrade())));
		System.out.println("Average grade per department: " + avgGrade);
		
		System.out.println("----------------------------------------------------------------------");
		
		// 5. List students sorted by age and then by grade
		List<Student> sortedStudents = list.stream()
                .sorted(Comparator.comparingInt((Student s) -> s.getAge()).thenComparingDouble(s -> s.getGrade()))
                .collect(Collectors.toList());
        System.out.println("Students sorted by age, then grade: " + sortedStudents);
        
        //Another way with reverse fashion
        list.stream().sorted(Comparator.comparingInt(Student::getAge).thenComparingDouble(Student::getGrade).reversed()).forEach(System.out::println);
	
        System.out.println("----------------------------------------------------------------------");
		
        // 6. Create a comma-separated list of student names
        String names = list.stream().map(s -> s.getFirstName() + " " + s.getLastName()).collect(Collectors.joining(","));
        System.out.println(names);
	
        System.out.println("----------------------------------------------------------------------");
		
        // 7. Check if all students are above 18
        boolean allAbove18 =list.stream().allMatch(s -> s.getAge() > 18);
        System.out.println(allAbove18);
        
        System.out.println("----------------------------------------------------------------------");
        
        // 8. Find the department with the most students
        String mostStudentsOfDept = list.stream()
        		.collect(Collectors.groupingBy(s -> s.getDepartment(), Collectors.counting()))
        		.entrySet().stream()
        		.max(Map.Entry.comparingByValue())
        		.map(Map.Entry::getKey).orElse("None");
        System.out.println("Department with most students: " + mostStudentsOfDept);
        
        System.out.println("----------------------------------------------------------------------");
        
        // 9. Divide students into those who have grades above 8.0 and below
       Map<Boolean, List<Student>> gradePartition = list.stream().collect(Collectors.partitioningBy(s -> s.getGrade() > 8.0));
       System.out.println("Students partitioned by grade: " + gradePartition);
       
       System.out.println("----------------------------------------------------------------------");
       
       // 10. Find the student with the longest full name
       Optional<Student> longestFullName = list.stream().max(Comparator.comparingInt(s -> (s.getFirstName()+s.getLastName()).length()));
       System.out.println("Student with longest full name: " + longestFullName);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
