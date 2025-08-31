package JavaIntPrep;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge2UnsortedArray {

	public static void main(String[] args) {
		
		int arr1[] = {3, 1, 4, 2, 6};
		int arr2[] = {5, 2, 6, 9, 3};
		
		int mergedArr[] = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
		System.out.println(Arrays.toString(mergedArr));
	}

}
