package JavaInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStringDistincts {
	
	public static void main(String args[]) {
		
		List<String> list = Arrays.asList("red", "pink", "yellow", "pink", "blue");
		
		list.stream().distinct().collect(Collectors.toList());
		
	}

}
