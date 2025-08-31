package JavaIntPrep;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class SecondHighestSecondLowest {

	public static void main(String[] args) {
		
		int arr[] = {3, 12, 16, 4, 9, 3, 19, 15, 12};
		
		Integer secondHighest = Arrays.stream(arr).boxed().sorted((a,b) -> b-a).distinct().skip(1).findFirst().orElseGet(null);
		
		System.out.println(secondHighest);
		
		Integer secondLowest = Arrays.stream(arr).sorted().distinct().skip(1).findFirst().orElseGet(null);
		
		System.out.println(secondLowest);
		
	}

}
