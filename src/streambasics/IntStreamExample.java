package streambasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamExample {

	public static void main(String[] args) {
		
		//merge two sorted arrays in a single sorted array
		
		int arr1[] = {1, 3, 5, 7, 7};
		int arr2[] = {2, 4, 6, 8};
		
		int mergeSortedArr[] = IntStream.concat(Arrays.stream(arr2), Arrays.stream(arr1)).distinct().sorted().toArray();
		System.out.println(Arrays.toString(mergeSortedArr));
		
		//concatenate two list of strings and remove duplicate strings
		
		List<String> color1 = Arrays.asList("pink", "red", "black", "blue");
		List<String> color2 = Arrays.asList("yellow", "blue", "white", "red");
		
		List<String> colors = Stream.concat(color1.stream(), color2.stream()).distinct().collect(Collectors.toList());
		System.out.println(colors);
		
		long dup = Arrays.stream(arr1).sorted().distinct().count();
		System.out.println(dup);
	}

}
