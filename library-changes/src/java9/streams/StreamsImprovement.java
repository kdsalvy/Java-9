package java9.streams;

import java.util.stream.Stream;

/**
 * In Java SE 9, Oracle has added four useful new methods to java.util.Stream interface. 
 * As Stream is an interface, all those new implemented methods are default methods. 
 * Two of them are very important: <b>dropWhile</b> and <b>takeWhile</b> methods
 * @author saukedia1
 *
 */
public class StreamsImprovement {

    public static void main(String[] args) {
        // takeWhile method includes the elements which matches the predicates, in the stream

        // If this stream is ordered then the longest prefix is a contiguous
        // sequence of elements of this stream that match the given predicate

        // If this stream is unordered, and some (but not all) elements of this
        // stream match the given predicate, then the behavior of this operation is
        // nondeterministic; it is free to take any subset of matching
        // elements(which includes the empty set).
        System.out.println("Take While Demo");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .takeWhile(i -> i < 5)
            .forEach(System.out::println);

        // dropWhile method filters the stream from elements for which the predicate matches

        // In Ordered streams it returns a stream consisting of the remaining
        // elements of this stream after dropping the longest prefix of elements
        // that match the given predicate

        // If this stream is unordered, and some (but not all) elements of this
        // stream match the given predicate, then the behavior of this operation is
        // nondeterministic; it is free to drop any subset of matching
        // elements(which includes the empty set).
        System.out.println("Drop While Demo");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .dropWhile(i -> i < 5)
            .forEach(System.out::println);
    }

}
