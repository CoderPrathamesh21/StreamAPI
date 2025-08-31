package streambasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 5, 8, 4, 23, 41, 27, 5, 1, 9, 8, 4, 16);
		
		//1st method
		Set<Integer> dupNum = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
		System.out.println(dupNum);
		
		//2nd method
		Set<Integer> set = new HashSet<>();
		Set<Integer> dupSet = list.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());
		System.out.println(dupSet);
		
		//remove duplicate elements from a list
		List<Integer> distNums = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distNums);
		
		//remove the duplicates elements from an array
		int arr[] = {2, 5, 8, 4, 2, 8, 1, 3, 4};
		int newArr[] = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(newArr));
		
		//given a list of strings, filter and print palindromes
		List<String> strings = Arrays.asList("level", "madam", "hello", "keep", "deed", "radar");
		
		List<String> palindromes = strings.stream().filter(str -> str.equals(new StringBuilder(str).reverse().toString()))
														.collect(Collectors.toList());
		System.out.println(palindromes);
	}
}
