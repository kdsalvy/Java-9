package java9.interfaces;

public class Java9InterfaceDemo {

    public static void main(String[] args) {
        // Access Static Method
        System.out.println(InterfacesWithPrivateMethods.getStaticGreetings());

        // Access Default Method
        System.out.println(new InterfacesWithPrivateMethods() {
        }.getInstanceGreetings());
    }
}
