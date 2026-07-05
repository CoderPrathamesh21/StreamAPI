package JavaIntPrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStingsBasedOnLengths {

	public static void main(String[] args) {
		
		List<String> colors = Arrays.asList("pink", "yellow", "blue", "red", "black");
		
		//1st method
		List<String> sortedColors = colors.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).collect(Collectors.toList());
		System.out.println(sortedColors);
		
		//2nd method
		List<String> sortedColors2 = colors.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		System.out.println(sortedColors2);

		//longest string in the list
		colors.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
	}

}
