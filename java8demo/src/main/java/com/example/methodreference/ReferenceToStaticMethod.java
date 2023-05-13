package com.example.methodreference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class StringUtils {
    public static boolean startsWithUpperCase(String s) {
        return Character.isUpperCase(s.charAt(0));
    }
}

public class ReferenceToStaticMethod {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Alice", "bob", "Charlie");

        // 람다
        List<String> a = names.stream()
            .filter(s -> StringUtils.startsWithUpperCase(s))
            .collect(Collectors.toList());
        System.out.println(a);

        // A reference to static method in a class
        List<String> b = names.stream()
            .filter(StringUtils::startsWithUpperCase)
            .collect(Collectors.toList());
        System.out.println(b);

        System.out.println(new HashSet<>(a).equals(new HashSet<>(b)));
    }
}
