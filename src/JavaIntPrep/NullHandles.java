package JavaIntPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class NullHandles {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", null, "Alice", null, "Bob");

        //filter out null objects
        List<String> list = names.stream().filter(Objects::nonNull).toList();
        System.out.println(list);


    }
}
