package com.example.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceExamplePredicate {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Using Predicate
        Predicate<Integer> evenNumberPredicate = n -> n % 2 == 0;
        List<Integer> evenNums = nums.stream()
            .filter(evenNumberPredicate)
            .collect(Collectors.toList());
        System.out.println(evenNums);
    }
}
