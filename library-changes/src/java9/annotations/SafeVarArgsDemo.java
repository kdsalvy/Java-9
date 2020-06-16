package java9.annotations;

import java.util.Arrays;
import java.util.List;

/**
 * @SafeVarargs annotation was included in Java 7 and can only be applied on
 * <ul>
 * <li> Final Methods </li>
 * <li> Static Methods </li>
 * <li> Constructors </li>
 * </ul>
 * From Java 9 we can use it over Private Instance Methods as well.
 * 
 * @author saukedia1
 *
 */
public class SafeVarArgsDemo {

    // Without this annotation it will give compile time error
    // Note: SafeVar.java uses unchecked or unsafe operations.
    // Note: Recompile with -Xlint:unchecked for details.
    
    // Prior to Java 9 this annotation on a private instance
    // method will give compilation error:
    // SafeVar.java:6: error: Invalid SafeVarargs annotation. 
    // Instance method display(List<String>...) is not final.
    @SafeVarargs
    private void display(List<String>... fruitsVarArgs) {
        for (List<String> fruits : fruitsVarArgs) {
            fruits.stream()
                .forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        SafeVarArgsDemo safeVarArgs = new SafeVarArgsDemo();
        safeVarArgs.display(
            Arrays.asList("Apple", "Mango", "Banana", "Orange", "Grape"), 
            Arrays.asList("Apple2", "Mango2", "Banana2", "Orange2", "Grape2"));
    }

}