package streambasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondHighestLowestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(21, 35, 1, 5, 8, 4, 23, 41, 27, 5, 1, 9, 8, 4, 16);
		
		//Second Highest
		Integer secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secondHighest);
		
		//Second Lowest
		Integer secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secondLowest);
	}

}
