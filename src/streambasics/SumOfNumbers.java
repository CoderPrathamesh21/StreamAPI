package streambasics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4, 67, 79, 8, 34, 53, 92, 21, 13);
		
		List<Double> list1 = Arrays.asList(4.67, 79.8, 34.53, 92.21, 1.3);
		
		//sum of numbers
		//1st method
		Optional<Integer>  sum = list.stream().reduce((a, b) -> (a+b));
		System.out.println(sum.get());
		
		//2nd method
		Integer sumList = list.stream().reduce(0, (a, b) -> (a+b));
		System.out.println(sumList);
		
		//3rd method
		int sumOfNum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sumOfNum);
		
		//Average of numbers
		Double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(avg);
		
		Double avgDouble = list1.stream().mapToDouble(e -> e).average().getAsDouble();
		System.out.println(avgDouble);

	}

}
