package java9.modules.client;

import java9.modules.hello.HelloWorld;
// import java9.modules.non.accessible.NonAccessibleClass;

public class Client {

    public static void main(String... args) {

        // Class from external module

        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.greet());

        // Cannot access this as it is not exported in the external module

        // NonAccessibleClass secretCodeClass = new NonAccessibleClass();
        // System.out.println(secretCodeClass);
    }
}
