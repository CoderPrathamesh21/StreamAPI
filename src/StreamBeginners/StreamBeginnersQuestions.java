package StreamBeginners;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamBeginnersQuestions {

	public static void main(String[] args) {
		
		// 1. Filtering Even Numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        
        System.out.println("----------------------------------------------------------------------");
        
        // 2. Convert List of Strings to Uppercase
        List<String> words = Arrays.asList("apple", "banana", "cherry", "mango", "grapes");
        
        List<String> caps = words.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());
        System.out.println(caps);
        
        System.out.println("----------------------------------------------------------------------");
        
        // 3. Find the First Element that Starts with 'S'
        List<String> names = Arrays.asList("John", "Smith", "Sara", "Michael");
        
        Optional<String> firstNameWithS = names.stream().filter(s -> s.startsWith("S")).findFirst();
        System.out.println(firstNameWithS.orElse("Not Found"));
        
        //find all names that starts with S
        List<String> sNames= names.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());
        System.out.println(sNames);
        
        System.out.println("----------------------------------------------------------------------");
        
        // 4. Sum of All Elements
        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        
        System.out.println("----------------------------------------------------------------------");
        
        // 5. Count Words with Length > 5
        long fruits =  words.stream().filter(w -> w.length() > 5).count();
        System.out.println(fruits);
        
        //find list of words whose length> 5
        List<String> fruits1 = words.stream().filter(w -> w.length() > 5).collect(Collectors.toList());
        System.out.println(fruits1);
        
        System.out.println("----------------------------------------------------------------------");
        
        // 6. Sorting Numbers in Descending Order
        List<Integer> reverseSorted = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted);
        
        System.out.println("----------------------------------------------------------------------");
        
        // 7. Remove Duplicates from a List
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
        List<Integer> distinctNumbers = duplicateNumbers.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);
        
        System.out.println("----------------------------------------------------------------------");
        
        // 8. Convert List of Strings to a Single Comma-Separated String
        String newWords = words.stream().collect(Collectors.joining(","));
        System.out.println(newWords);
        
        System.out.println("----------------------------------------------------------------------");
        
        // 9. Find the Maximum Value
        Optional<Integer> maxValue = numbers.stream().max(Comparator.comparingInt(n -> n));
        System.out.println(maxValue.get());
        
        //Another way
        Optional<Integer> maxValue2 = numbers.stream().max(Comparator.naturalOrder());
        System.out.println(maxValue2.get());
        
        System.out.println("----------------------------------------------------------------------");
        
        // 10. Check if Any String Starts with 'A'
        List<String> nameList = Arrays.asList("Bob", "Alice", "Charlie", "Andrew");
        
        boolean stringWithA = nameList.stream().anyMatch(s -> s.startsWith("A"));
        System.out.println(stringWithA);
        
        
        
        
        
	}

}
