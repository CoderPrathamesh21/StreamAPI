package streambasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(4, 67, 49, 458, 432, 53, 492, 21, 13);
		
		List<Integer> numStartsWith2 = list.stream().map(e -> String.valueOf(e))
							.filter(e -> e.startsWith("4") && e.endsWith("2"))
								.map(Integer::valueOf).collect(Collectors.toList());
							
		System.out.println(numStartsWith2);
		
		List<Integer> numListWith2 = list.stream().filter(n -> String.valueOf(n).startsWith("4")).collect(Collectors.toList());
		System.out.println(numListWith2);
	}

}
