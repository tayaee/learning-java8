package com.example.methodreference;

import java.util.Arrays;
import java.util.List;

public class ReferenceToObjectMethod {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("One", "Two", "Three");
        Printer printer = new Printer();
        names.forEach(printer::print);
    }
}
