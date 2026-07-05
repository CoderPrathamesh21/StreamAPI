package JavaIntPrep;

import java.util.*;
import java.util.stream.Collectors;

public class CountDuplicates {

	public static void main(String[] args) {
		
		Integer arr[] = {1, 3, 2, 5, 2, 6, 3, 1, 4};
		
		//List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		List<Integer> list = Arrays.asList(arr);
		
		long duplicates = list.stream().filter(e -> Collections.frequency(list, e) > 1).distinct().count();
		System.out.println(duplicates);

		//2nd method
		List<Integer> duplicateNumbers = Arrays.stream(arr).filter(i -> Collections.frequency(list, i) > 1).distinct().toList();
		System.out.println(duplicateNumbers);

		//3rd method
		List<Integer> duplicateElements = Arrays.stream(arr)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey)
				.toList();
		System.out.println(duplicateElements);

		long uniqueCount = Arrays.stream(arr).distinct().count();
		System.out.println(uniqueCount);

		List<Integer> uniqueElements = Arrays.stream(arr).sorted().distinct().toList();
		System.out.println(uniqueElements);

	}

}
