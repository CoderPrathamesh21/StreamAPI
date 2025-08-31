package JavaIntPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountDuplicates {

	public static void main(String[] args) {
		
		Integer arr[] = {1, 3, 2, 5, 2, 6, 3, 1, 4};
		
		//List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		List<Integer> list = Arrays.asList(arr);
		
		
		long duplicates = list.stream().filter(e -> Collections.frequency(list, e) > 1).distinct().count();
		System.out.println(duplicates);

	}

}
