package JavaIntPrep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 3, 6, 5, 8);
        List<Integer> list3 = Arrays.asList(1, 7, 3, 6, 5);

        Set<Integer> set2 = new HashSet<>(list2);
        Set<Integer> set3 = new HashSet<>(list3);

        List<Integer> commonElements = list1.stream()
                .filter(set2::contains)
                .filter(set3::contains)
                .toList();
        System.out.println(commonElements);

    }
}
