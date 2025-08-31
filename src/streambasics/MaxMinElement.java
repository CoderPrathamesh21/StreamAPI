package streambasics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinElement {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 5, 8, 4, 23, 41, 27, 5, 1, 9, 8, 4, 16);
		
		//1st method
		//max element
		Integer max = list.stream().reduce(1, (a,b) -> (a > b ? a : b));
		System.out.println(max);
		
		//min element
		Integer min = list.stream().reduce(1, (a,b) -> (a < b ? a : b));
		System.out.println(min);
		
		//2nd method
		Integer maxValue = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxValue);
		
		Integer minValue = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minValue);
	}

}
