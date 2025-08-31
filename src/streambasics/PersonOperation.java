package streambasics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonOperation {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
				new Person("Max", 34, "Australia"),
				new Person("Jos", 31, "England"),
				new Person("Reddy", 28, "India"),
				new Person("Will", 30, "NZ"));
		
		people.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);

	}

}
