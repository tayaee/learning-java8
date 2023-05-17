package com.example.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        System.out.println("1 future의 action 정의");
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("4 작업 실행 시작");
            try {                
                Thread.sleep(3000);                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("7 작업 실행 끝");
            return 42;
        });
        System.out.println("2 future의 action 정의 완료");

        System.out.println("3 future의 response 정의");
        future.thenAccept(result -> System.out.println("9 비동기 작업 결과: " + result));
        System.out.println("5 future의 response 정의 완료");

        // 메인 스레드가 종료되지 않도록 대기
        try {
            System.out.println("6 future 실행 전");
            future.get(); // 비동기 작업이 완료될 때까지 대기
            System.out.println("8 future 실행 후");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
