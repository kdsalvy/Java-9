package java9.optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * In Java 9, methods have been added to optional class to enhance its functionalities</br>
 * <ol>
 * <li> Optional Stream </li>
 * <li> ifPresentOrElse() Method </li>
 * <li> or() Method </li>
 * </ol>
 * @author saukedia1
 *
 */
public class OptionalClassAdditionsDemo {

    public static void main(String[] args) {
        emptyOptionalStream();

        optionaOrDemo();

        optionalIfPresentOrElseDemo();
    }

    /**
     * If optional has value then action part of the method will be performed
     * else the runnable part will be executed
     */
    private static void optionalIfPresentOrElseDemo() {
        // When opt1 is not empty
        Optional<String> opt1 = Optional.of("Hello World");
        opt1.ifPresentOrElse(System.out::println, () -> System.out.println("Empty String"));

        // When opt1 is empty
        opt1 = Optional.empty();
        opt1.ifPresentOrElse(System.out::println, () -> System.out.println("Empty String"));
    }

    /**
     * If 1st optional object is empty then or will return 2nd. If 
     * 1st is not empty then or will return the first object
     */
    private static void optionaOrDemo() {
        // When Opt 1 is non empty
        Optional<String> opt1 = Optional.of("abc");
        Supplier<Optional<String>> opt2 = () -> Optional.of("xyz");

        System.out.println(opt1.or(opt2));

        // When Opt 3 is empty
        Optional<String> opt3 = Optional.empty();
        Supplier<Optional<String>> opt4 = () -> Optional.of("xyz");

        System.out.println(opt3.or(opt4));
    }

    /**
     * If a value present in the given Optional object, this stream()
     * method returns a sequential Stream with that value. Otherwise,
     * it returns an Empty Stream
     */
    private static void emptyOptionalStream() {
        // demo with empty stream
        Stream<Optional<String>> stream = getStrings(1);
        Stream<String> strStream = stream.flatMap(Optional::stream);
        strStream.forEach(System.out::println);

        // demo with stream of strings
        stream = getStrings(2);
        strStream = stream.flatMap(Optional::stream);
        strStream.forEach(System.out::println);
    }

    private static Stream<Optional<String>> getStrings(int i) {
        List<Optional<String>> strings = List.of(Optional.of("Hello"), Optional.of("World"), Optional.of("!"));
        return i % 2 == 0 ? Stream.empty() : strings.stream();
    }

}
