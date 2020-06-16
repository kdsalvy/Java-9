package java9.annotations;

/**
 * In Java SE 9, Oracle has enhanced @Deprecated annotation to provide 
 * more information about deprecated API and also provide a Tool to analyze 
 * an application’s static usage of deprecated APIs. They have add two methods 
 * to this Deprecated interface: "forRemoval" and "since" to serve this information
 * @author saukedia1
 *
 */
public class EnhancedDeprecatedAnnotationDemo {

    // forRemoval indicates that the API will be removed from the future release of Java.
    // since contains the Java SE version string when the method got deprecated.
    @Deprecated(forRemoval = true, since = "1.9")
    public String oldMethod() {
        return "I'm outdated method";
    }

    public String enhancedNewMethod() {
        return "I'm enhanced new method";
    }

}
