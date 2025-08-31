package streambasics;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4, 11, 8,  13, 16);
		
		Double sqrAverage = list.stream().map(e -> e * e).filter(e -> e > 100).mapToInt(e -> e).average().getAsDouble();
		System.out.println(sqrAverage);

	}

}
