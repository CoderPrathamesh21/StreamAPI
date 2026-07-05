package JavaIntPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageEvenNumbers {

    public static void main(String[] args) {

        int arr[] = { 12, 32, 21, 34, 53, 62, 71, 28, 93};

        //average of even number
        double average = Arrays.stream(arr).filter(n -> n % 2 == 0).average().orElse(0.0);
        System.out.println("Average of even numbers: " + average);

        System.out.println("=======================================");

        //sum of entire array
        long sum = Arrays.stream(arr).sum();
        System.out.println("Sum of entire array: " + sum);

        System.out.println("=======================================");

        //find even numbers and multiply by 2
        int[] array = Arrays.stream(arr).sorted().filter(n -> n % 2 == 0).map(n -> n * 2).toArray();
        System.out.println(Arrays.toString(array));

        System.out.println("=======================================");

        //partition numbers into even and odd
        //Arrays.stream(arr).collect(Collectors.partitioningBy((n -> n % 2 == 0)));

        //partition numbers into even and odd
        Map<Boolean, List<Integer>> partitioned = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitioned);

        Map<String, List<Integer>> partitioned1 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd"));
        System.out.println(partitioned1);

    }
}
