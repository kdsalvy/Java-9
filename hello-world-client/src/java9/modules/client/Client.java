package java9.modules.client;

import java9.modules.hello.HelloWorld;

public class Client {
    
    public static void main(String... args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.greet());
    }
}
