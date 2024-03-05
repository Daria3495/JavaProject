package homework.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ButterfliesRunner {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        butterflies
                .stream()
                .map(s -> "\"" + s + "\"")
                .collect(Collectors.toList())
                .stream().filter(s -> s.contains("a") && s.contains("o"))
                .forEach(System.out::println);
    }

}
