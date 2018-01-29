package designpattern.AbstractFactory.CarExample.factory;

import designpattern.AbstractFactory.CarExample.car.AbstractCar;
import designpattern.AbstractFactory.CarExample.car.LuxuryCar;
import designpattern.AbstractFactory.CarExample.car.MicroCar;
import designpattern.AbstractFactory.CarExample.car.MiniCar;

public class USACarFactory
{
    public static AbstractCar buildCar(String model)
    {
        AbstractCar car = null;
        switch (model)
        {
            case "MICRO":
                car = new MicroCar("USA");
                break;
             
            case "MINI":
                car = new MiniCar("USA");
                break;
                 
            case "LUXURY":
                car = new LuxuryCar("USA");
                break;
                 
                default:
                break;
             
        }
        return car;
    }
}