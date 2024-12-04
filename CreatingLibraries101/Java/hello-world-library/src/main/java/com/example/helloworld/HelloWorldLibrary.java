package com.example.helloworld;

/**
 * A simple library for generating hello world messages.
 */
public class HelloWorldLibrary {
    /**
     * Generates a personalized hello world message.
     * 
     * @param name The name to include in the greeting
     * @return A friendly hello world message
     */
    public String generateHelloWorld(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "! Welcome to the Hello World Library.";
    }

    /**
     * Generates a default hello world message.
     * 
     * @return A standard hello world greeting
     */
    public String generateHelloWorld() {
        return generateHelloWorld(null);
    }
}
