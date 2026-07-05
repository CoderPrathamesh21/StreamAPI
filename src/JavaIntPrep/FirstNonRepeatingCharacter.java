package JavaIntPrep;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "Swiss";

        Character ch = Arrays.stream(str.toLowerCase().split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey().charAt(0))
                .findFirst()
                .orElse(null);
        System.out.println(ch);
    }
}
