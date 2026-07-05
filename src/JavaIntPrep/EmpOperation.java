package JavaIntPrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpOperation {

	public static void main(String[] args) {
		
		List<Employee> emps = Arrays.asList(
				
				new Employee("Dan", 24, 72000, "IT", "New York"),
				new Employee("Jacob", 22, 42000, "IT", "New York"),
				new Employee("Sam", 22, 25000, "Finance", "Los Angeles"),
				new Employee("Will", 25, 48000, "HR", "Chicago"),
				new Employee("Dan", 27, 58000, "HR", "Houston"));
		
		emps.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		
		System.out.println("=======================================");
		
		//for descending order
		emps.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);

		System.out.println("=======================================");

		//highest paid employee in HR department
		emps.stream().filter(e -> e.getDepartment().equals("HR")).max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

		//highest paid employee in HR department - salary only
		emps.stream().filter(e -> e.getDepartment().equals("HR")).max(Comparator.comparing(Employee::getSalary))
				.map(Employee::getSalary).ifPresent(System.out::println);

		System.out.println("=======================================");

		//employee count in each department
		emps.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
				.forEach((department, count) -> System.out.println(department + ": " + count));

		System.out.println("=======================================");

		//emps.stream().filter(e -> e.getCity().equalsIgnoreCase("New York")).forEach(System.out::println);
		emps.stream()
				.filter(e -> e.getCity() != null && e.getCity().equalsIgnoreCase("New York"))
				.sorted(Comparator.comparing(Employee::getName))
				.forEach(System.out::println);

		System.out.println("=======================================");

		emps.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
				.forEach((name, count) -> System.out.println(name + ": " + count));

		System.out.println("=======================================");

		//find 2nd highest employee
		emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst()
				.ifPresent(System.out::println);

		//highest paid employee
		emps.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

		System.out.println("=======================================");

		//find top 3 highest paid employees
		emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);

		System.out.println("=======================================");

		//convert list into map
		//emps.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary)).forEach((name, salary) -> System.out.println(name + ": " + salary));

		emps.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary, (existingValue, newValue) -> existingValue))
				.forEach((name, salary) -> System.out.println(name + ": " + salary));

		//2nd approach
		Map<String, Employee> employeeMap = emps.stream().collect(Collectors.toMap(Employee::getName, Function.identity(), (existingValue, newValue) -> existingValue));
		System.out.println(employeeMap);

		System.out.println("=======================================");

		Map<String, Employee> employeeMap1 = emps.stream().collect(Collectors.toMap(Employee::getName, Function.identity(), (existingValue, newValue) -> newValue));
		System.out.println(employeeMap1);

		System.out.println("=======================================");

		//merge duplicates
		Map<String, String> employeeMap2 = emps.stream().collect(Collectors.toMap(Employee::getName, e -> String.valueOf(e.getAge()), (existingValue, newValue) -> existingValue + "," + newValue));
		System.out.println(employeeMap2);

		System.out.println("=======================================");

		//duplicates handle
		Map<String, List<Employee>> listMap = emps.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println(listMap);

	}

}
