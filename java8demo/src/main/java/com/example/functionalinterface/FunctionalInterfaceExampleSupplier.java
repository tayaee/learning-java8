package com.example.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class FunctionalInterfaceExampleSupplier {
    public static void main(String[] args) {
        // 로또 번호 생성하는 supplier. 
        Supplier<Integer> lottoNumSupplier = () -> new Random().nextInt(45) + 1;

        for (int i = 0; i < 6; i++) {
            System.out.println(lottoNumSupplier.get());
        }
    }
}
