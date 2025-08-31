package streambasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AsDescSorting {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(21, 35, 1, 5, 8, 4, 23, 41, 27, 5, 1, 9, 8, 4, 16);
		
		//ascending order
		List<Integer> ascending = list.stream().sorted().collect(Collectors.toList());
		System.out.println(ascending);
		
		//descending order
		List<Integer> descending = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descending);
	}

}
