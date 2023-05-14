package com.example.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterfaceExampleFunction {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Using Function
        Function<Integer, Boolean> evenNumberFunction = n -> n % 2 == 0;

        nums.stream()
            .map(evenNumberFunction)
            .forEach(System.out::println);        
    }
}
