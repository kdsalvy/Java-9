package java9.execptions.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Java 7 introduced the feature try with resources to provide better
 * maintainability of resources by closing them automatically while exiting
 * try scope. Java 9 has added improvement to this feature to increase the
 * readability.
 * 
 * @author saukedia1
 *
 */
public class TryWithResourcesImprovementDemo {

    public static void main(String[] args) {
        // In Java 7, the resource must be declared in the try(...)
        // But in Java 9 we can declare the same outside and pass it in try
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (reader) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
