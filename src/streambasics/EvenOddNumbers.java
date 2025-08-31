package streambasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4, 67, 79, 8, 34, 53, 92, 21, 13);
		
		List<Integer> evenList = list.stream().filter( e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<Integer> oddList = list.stream().filter( e -> e % 2 != 0).collect(Collectors.toList());
		System.out.println(oddList);

	}

}
