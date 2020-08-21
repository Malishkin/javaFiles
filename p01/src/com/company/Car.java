package com.company;

public class Car {

    public void fullThrottle() {
        System.out.println("The car can going about 200 km/h");
    }

    public void actualSpeed(int speed) {
        System.out.println("Actual speed now is "+speed +" km/h");
    }
    public static void main(String [] args){
        Car myCar = new Car();
        myCar.fullThrottle();
        myCar.actualSpeed(80);
    }
}

