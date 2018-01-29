package designpattern.AbstractFactory.CarExample;

import designpattern.AbstractFactory.CarExample.factory.CarFactory;

class FinalBuild {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar("MICRO"));
        System.out.println(CarFactory.buildCar("MINI"));
        System.out.println(CarFactory.buildCar("LUXURY"));
    }
}