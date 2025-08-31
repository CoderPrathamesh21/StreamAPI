package JavaInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaString {

	public static void main(String[] args) {
		
		
		String str = "Hello";
		
		Map<Character, Long> dupChars =  str.chars() //Converts the string into an IntStream of Unicode values
				.mapToObj(c -> (char) c) //Converts/maps each int to a Character object
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); //collects the characters into map and counts the occurrences of each character
				
				
				
		dupChars.entrySet().stream() //Converts the map to a stream of k-v pairs
		.filter(entry -> entry.getValue() > 1) //Filters only those characters that occur more than once
		.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue())); //prints each duplicate character and its count
		
		
		//System.out.println(dupChars);
		
		
		
		
		

	}

}
