import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        System.out.println(IntStream.range(2, 10)
                .sum());

        Stream.of("John", "Smith", "Wilfred")
                .filter(x -> !x.startsWith("J"))
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        System.out.println(IntStream.of(2, 4, 6, 8)
                .average()
                .getAsDouble());

    }

}
