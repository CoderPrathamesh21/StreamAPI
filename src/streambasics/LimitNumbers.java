package streambasics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(21, 35, 1, 5, 8, 4, 23, 41, 27, 5, 1, 9, 8, 4, 16);
		
		//limit
		//get first 5 numbers -> sum of first 5 numbers
		List<Integer> firstFive = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(firstFive);
		
		Optional<Integer> sum = firstFive.stream().reduce((a,b) -> (a+b));
		System.out.println(sum.get());
		
		//skip
		List<Integer> skipNum = list.stream().skip(7).collect(Collectors.toList());
		System.out.println(skipNum);
		
		int skipSum = skipNum.stream().reduce((a,b) -> (a+b)).get();
		System.out.println(skipSum);
	}

}
