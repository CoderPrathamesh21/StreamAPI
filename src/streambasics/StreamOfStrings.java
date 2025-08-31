package streambasics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOfStrings {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple", "banana", "guava", "berry", "grapes", "beatroot");
		
		
		long count = fruits.stream().filter(s -> s.startsWith("b")).count();
		System.out.println(count);
		
		//convert a list of strings to uppercase
		fruits.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//concatenate list of strings
		String concatenatedFruits = fruits.stream().collect(Collectors.joining("_"));
		System.out.println(concatenatedFruits);
		
		//find and print frequency of each  word.
		String sentence = "Java is a programming language. Java is a versatile.";
		
		Map<String, Long> wordFreq = Arrays.stream(sentence.split("\\s+")).collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
		System.out.println(wordFreq);
		
		//group names by their first letter and count no. of such names
		String names[] = {"Arjun", "Virat", "Pranay", "Pratham", "Vipul", "Akash"};
		
		Map<Character, Long> charMap = Arrays.stream(names).collect(Collectors.groupingBy(n -> n.charAt(0), Collectors.counting()));
		System.out.println(charMap);
		
		//sort list of strings based on incresing order of their length
		List<String> watches = Arrays.asList("fastrack", "rolex", "fossil", "hilfiger", "titan", "sonata");
		
		List<String> sortedWatches = watches.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		System.out.println(sortedWatches);
	}

}
