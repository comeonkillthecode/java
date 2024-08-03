package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akash", "Boora", "Srinivas", "Sharadha");

        Optional<String> string = names.stream().filter(str-> str.contains("h")).findFirst();
        System.out.println(string.orElse("Not Found"));

        string = names.stream().filter(str-> str.contains("z")).findFirst();
        System.out.println(string.orElse("Not Found"));
    }
}
