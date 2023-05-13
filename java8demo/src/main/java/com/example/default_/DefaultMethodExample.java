package com.example.default_;

interface Vehicle {
    void start();
    void stop();
    default void honk() {
        System.out.println("경적을 울립니다.");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("자동차 시동을 켭니다.");
    }

    @Override
    public void stop() {
        System.out.println("자동차 시동을 끕니다.");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("자전거를 밟아 출발합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자전거를 멈춥니다.");
    }

    @Override
    public void honk() {
        System.out.println("자전거에는 경적이 없습니다.");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // 출력: 자동차 시동을 켭니다.
        car.stop(); // 출력: 자동차 시동을 끕니다.
        car.honk(); // 출력: 차량이 경적을 울립니다.

        System.out.println();

        Bike bike = new Bike();
        bike.start(); // 출력: 자전거를 밟아 출발합니다.
        bike.stop(); // 출력: 자전거를 멈춥니다.
        bike.honk(); // 출력: 자전거에는 경적이 없습니다.    
    }
}
