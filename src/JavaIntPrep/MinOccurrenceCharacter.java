package JavaIntPrep;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinOccurrenceCharacter {

    public static void main(String[] args) {

        String str = "Programming";

        Map<Character, Long> frequencyMap = str.toLowerCase().chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        long minOccurrence = Collections.min(frequencyMap.values());
        //long maxOccurrence = Collections.max(frequencyMap.values());

        frequencyMap.entrySet()
                .stream()
                .filter(e -> e.getValue() == minOccurrence)
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        System.out.println("=======================================");

        //to count every character in a string
        frequencyMap.forEach((ch, value) -> System.out.println(ch + " -> " + value));

        System.out.println("=======================================");

        //to check if string has all unique characters
        boolean allUnique = str.chars().mapToObj(c -> (char) c).distinct().count() == str.length();
        System.out.println("All characters are unique: " + allUnique);

        //2nd approach
        boolean hasAllUnique = str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == str.length();
        System.out.println("All characters are unique: " + hasAllUnique);


    }
}
