package com.example.helloworld.client;

import com.example.helloworld.HelloWorldLibrary;

/**
 * A client application that demonstrates the usage of HelloWorldLibrary.
 */
public class HelloWorldClientApp {
    public static void main(String[] args) {
        // Create an instance of the library
        HelloWorldLibrary library = new HelloWorldLibrary();

        // Demonstrate different ways of using the library
        System.out.println(library.generateHelloWorld());
        
        // Use a personalized greeting
        String name = args.length > 0 ? args[0] : "Developer";
        System.out.println(library.generateHelloWorld(name));
    }
}
