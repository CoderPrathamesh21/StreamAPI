package StreamBeginners;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMediumQuestions {

	public static void main(String[] args) {
		
		// 1. Find the Second-Highest Number
        // Steps: Remove duplicates -> Sort in descending order -> Skip the highest -> Get the second-highest
        List<Integer> numbers = Arrays.asList(10, 20, 5, 8, 30, 25, 30);
        
        Optional<Integer> secondHighest = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        System.out.println("Second highest number: " + secondHighest.get());
        
        System.out.println("---------------------------------------------");
        
        // 2. Count Occurrences of Each Word
        // Steps: Group words -> Count occurrences
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<Object, Long> countOnFruits = words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(countOnFruits);
        
        //Another way
        Map<String, Long> count = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);
        
        System.out.println("---------------------------------------------");
        
        //3. Remove Null and Empty Values
        // Steps: Remove null values -> Remove empty strings
        List<String> values = Arrays.asList("Spring", "", null, "Hibernate", "Java", "");
        
        List<String> newValues = values.stream().filter(Objects::nonNull).filter(v -> !v.isEmpty()).collect(Collectors.toList());
        System.out.println(newValues);
        
        System.out.println("---------------------------------------------");
        
        // 4. Find the Longest Word
        // Steps: Compare word lengths -> Get the longest
        String longestWord =words.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(longestWord);
        
        System.out.println("---------------------------------------------");
        
        // 5. Convert List of Objects to a Map
        // Steps: Convert List<Employee> to Map<Id, Name>
        List<Employee> employees = Arrays.asList(new Employee(1, "John"), new Employee(2, "Jane"), new Employee(3, "Alice"));
        Map<Integer, String> empMap =  employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(empMap);
        
        //Alternate way
        Map<Integer, String> empMap1 = employees.stream().collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
        System.out.println(empMap1);
        
        System.out.println("---------------------------------------------");
        
        // 6. Flatten a List of Lists into a Single List
        // Steps: Flatten nested lists into a single list
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(1, 4, 9));
        List<Integer> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatList);
        
        List<Integer> flatList1 = nestedList.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
        System.out.println(flatList1);
        
        System.out.println("---------------------------------------------");
        
        // 7. Group Numbers into Even and Odd
        // Steps: Partition numbers into even and odd groups
        List<Integer> nums = Arrays.asList(25, 32, 18, 47, 9, 52, 11);
        Map<Boolean, List<Integer>> evenOdd = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(evenOdd);
        
        System.out.println("---------------------------------------------");
        
        // 8. Sort Strings by Length
        // Steps: Sort words based on length
        List<String> colors = Arrays.asList("green", "blue", "yellow", "indigo", "orange", "purple", "brown");
        List<String> newColors = colors.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(newColors);
        
        System.out.println("---------------------------------------------");
        
        // 9. Find First Non-Repeating Character in a String
        // Steps: Convert to stream -> Count occurrences -> Find the first unique character
        String input = "aabbcdeffg";
        
        Character firstNonRepeating = input.chars().mapToObj(c -> (char)c)  // Converts int stream to Character stream
        .collect(Collectors.groupingBy(Function.identity(), // Groups by character
        		LinkedHashMap::new, Collectors.counting())) // Counts occurrences
        .entrySet().stream()
        .filter(entry -> entry.getValue() == 1) // Filters characters occurring only once
        .map(Map.Entry::getKey) // Extracts the character
        .findFirst() // Finds the first match, //to get second non-repeating character use skip(1) before findfirst
        .orElse(null); // Returns null if no match found
        
        System.out.println(firstNonRepeating);
        
        System.out.println("---------------------------------------------");
        
        // 10. Find the Most Repeated Number
        // Steps: Count occurrences -> Get the most repeated number
        List<Integer> numList = Arrays.asList(1, 4, 9, 3, 4, 1, 6, 8, 4);
        Integer mostRepeated = numList.stream()
        		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        		.entrySet().stream()
        		.max(Map.Entry.comparingByValue())
        		.map(Map.Entry::getKey).orElse(null);
        System.out.println(mostRepeated);
	}

}
