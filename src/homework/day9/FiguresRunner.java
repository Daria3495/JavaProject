package homework.day9;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FiguresRunner {

    public static void main(String[] args) {

        Stream<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        figures.mapToInt(String::length).filter(length -> length > 4).forEach(System.out::println);
    }

}
