package JavaIntPrep;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumbersFromAlphaNumericArray {

    public static void main(String[] args) {

        char arr[] = {'A', '1', 'B', '2', 'C', '3', 'D', '4'};

        //print numbers
        String numbers = Arrays.stream(new String(arr).split(""))
                        .filter(e -> Character.isDigit(e.charAt(0)))
                        .collect(Collectors.joining());
        System.out.println(numbers);

        //print chars
        String chars = Arrays.stream(new String(arr).split(""))
                        .filter(e -> Character.isLetter(e.charAt(0)))
                        .collect(Collectors.joining());
        System.out.println(chars);


    }
}
