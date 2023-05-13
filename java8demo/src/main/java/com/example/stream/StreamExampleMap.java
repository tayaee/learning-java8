package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfSquares = nums.stream()
            .map(n -> n * n)
            .reduce(0, Integer::sum);
        System.out.println(sumOfSquares);
    }
}
