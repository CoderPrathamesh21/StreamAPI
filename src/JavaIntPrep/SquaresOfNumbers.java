package JavaIntPrep;

import java.util.Arrays;

public class SquaresOfNumbers {

	public static void main(String[] args) {

		int arr[] = {2, 5, 7, 9};
		
		int sqrArr[] = Arrays.stream(arr).map(e -> e * e).toArray();
		System.out.println(Arrays.toString(sqrArr));

	}

}
