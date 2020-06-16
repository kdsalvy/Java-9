package java9.interfaces;

/**
 * Java 9 changes the interfaces by allowing to add private access modifiers 
 * to the methods(both static a& non-static)
 * @author saukedia1
 *
 */
public interface InterfacesWithPrivateMethods {

    private String fetchInstanceGreetings() {
        return "Hello World from Instance Private Method";
    }

    default String getInstanceGreetings() {
        return fetchInstanceGreetings();
    }

    private static String fetchStaticGreetings() {
        return "Hello World from Static Private Method";
    }

    static String getStaticGreetings() {
        return fetchStaticGreetings();
    }
}
