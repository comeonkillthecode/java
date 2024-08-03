package stream;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akash", "Boora", "Srinivas", "Sharadha");

        names = names.stream().map(name -> name.toUpperCase()).toList();
        System.out.println(names);

        names = Arrays.asList("Akash", "Boora", "Srinivas", "Sharadha");

        names = names.stream().map(String::toUpperCase).toList();
        names.forEach(System.out::println);
    }
}
