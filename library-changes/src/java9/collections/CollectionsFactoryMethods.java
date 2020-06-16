package java9.collections;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * In Java 9 Oracle has introduced some convenient factory methods 
 * to create Immutable List, Set, Map and Map.Entry objects. These 
 * utility methods are used to create empty or non-empty Collection objects. 
 * 
 * @author saukedia1
 *
 */
public class CollectionsFactoryMethods {

    public static void main(String... args) {

        // Immutable Empty List
        List<String> immutableEmptyList = List.of();
        // Immutable Non Empty List
        List<String> immutableNonEmptyList = List.of("Hello", "World", "From", "Saurabh", "Kedia");
        System.out.println(immutableEmptyList);
        System.out.println(immutableNonEmptyList);
        // this will throw java.lang.UnsupportedOperationException as the lists are immutable
        // immutableEmptyList.add("Can't add this");
        // immutableNonEmptyList.add("Can't add this");

        // Immutable Empty Map
        Map<String, String> immutableEmptyMap = Map.of();
        // Immutable Non Empty Map
        Map<String, String> immutableNonEmptyMap = Map.of("Hello", "World", "Saurabh", "Kedia");
        System.out.println(immutableEmptyMap);
        System.out.println(immutableNonEmptyMap);
        // this will throw java.lang.UnsupportedOperationException as the lists are immutable
        // immutableEmptyMap.put("Can't add this Key", "Can't add this value");
        // immutableNonEmptyMap.put("Can't add this Key", "Can't add this value");

        // Immutable Non Empty Entry
        Entry<String, String> immutableNonEmptyEntry = Map.entry("Hello", "World");
        System.out.println(immutableNonEmptyEntry);
        // this will throw java.lang.UnsupportedOperationException as the lists are immutable
        // immutableNonEmptyEntry.setValue("Saurabh");

        // Immutable Empty List
        Set<String> immutableEmptySet = Set.of();
        // Immutable Non Empty List
        Set<String> immutableNonEmptySet = Set.of("Hello", "World", "From", "Saurabh", "Kedia");
        System.out.println(immutableEmptySet);
        System.out.println(immutableNonEmptySet);
        // this will throw java.lang.UnsupportedOperationException as the lists are immutable
        // immutableEmptySet.add("Can't add this");
        // immutableNonEmptySet.add("Can't add this");
    }
}
