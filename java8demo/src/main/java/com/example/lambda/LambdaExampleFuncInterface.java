package com.example.lambda;
@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExampleFuncInterface {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println("덧셈 결과: " + addition.operation(3, 4));

        MathOperation mul = (a, b) -> a * b;
        System.out.println("곱셈 결과: " + mul.operation(3, 4));
    }
}