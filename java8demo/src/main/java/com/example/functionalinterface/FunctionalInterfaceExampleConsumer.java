package com.example.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceExampleConsumer {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("One", "Two", "Three");

        // Using Consumer
        Consumer<? super String> printName = System.out::println;
        names.forEach(printName);
    }
}
