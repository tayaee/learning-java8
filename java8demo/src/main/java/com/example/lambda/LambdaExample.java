package com.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("David");

        // 이름을 알파벳 순으로 정렬
        Collections.sort(names, (a, b) -> a.compareTo(b));

        // 정렬된 이름 출력
        for (String name : names) {
            System.out.println(name);
        }
    }
}
