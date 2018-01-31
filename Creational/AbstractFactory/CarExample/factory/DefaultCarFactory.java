package designpattern.Creational.AbstractFactory.CarExample.factory;

import designpattern.Creational.AbstractFactory.CarExample.car.AbstractCar;
import designpattern.Creational.AbstractFactory.CarExample.car.LuxuryCar;
import designpattern.Creational.AbstractFactory.CarExample.car.MicroCar;
import designpattern.Creational.AbstractFactory.CarExample.car.MiniCar;

public class DefaultCarFactory {
    public static AbstractCar buildCar(String model)
    {
        AbstractCar car = null;
        switch (model)
        {
            case "MICRO":
                car = new MicroCar("DEFAULT");
                break;
             
            case "MINI":
                car = new MiniCar("DEFAULT");
                break;
                 
            case "LUXURY":
                car = new LuxuryCar("DEFAULT");
                break;
                 
                default:
                break;
             
        }
        return car;
    }
}