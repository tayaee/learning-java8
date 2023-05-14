package com.example.stream;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class ParallelStreamExample {

    static void slowPrinter(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        long t1 = System.currentTimeMillis();
        System.out.print("일반 스트림: ");
        Arrays.stream(nums).forEach(n -> slowPrinter(n));
        long t2 = System.currentTimeMillis() - t1;
        System.out.println(t2 + " msecs");

        t1 = System.currentTimeMillis();
        System.out.print("병렬 스트림: ");
        Arrays.stream(nums).parallel().forEach(n -> slowPrinter(n));
        t2 = System.currentTimeMillis() - t1;
        System.out.println(t2 + " msecs");

        t1 = System.currentTimeMillis();
        System.out.print("6x 병렬 스트림: ");
        ForkJoinPool customThreadPool = new ForkJoinPool(6);
        customThreadPool.submit(() ->
                Arrays.stream(nums)
                        .parallel()
                        .forEach(n -> slowPrinter(n))
        ).join();
        customThreadPool.shutdown();
        // try {
        //     Thread.sleep(5000);
        // } catch (InterruptedException e) { }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(t2 + " msecs");
    }
}
