package JavaIntPrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpOperation {

	public static void main(String[] args) {
		
		List<Employee> emps = Arrays.asList(
				
				new Employee("Dan", 24, 32000),
				new Employee("Sam", 22, 25000),
				new Employee("Will", 25, 48000));
		
		emps.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		
		System.out.println("=======================================");
		
		//for descending order
		emps.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);
		

	}

}
