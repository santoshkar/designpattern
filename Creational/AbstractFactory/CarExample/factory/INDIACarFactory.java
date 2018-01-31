package designpattern.Creational.AbstractFactory.CarExample.factory;

import designpattern.Creational.AbstractFactory.CarExample.car.AbstractCar;
import designpattern.Creational.AbstractFactory.CarExample.car.LuxuryCar;
import designpattern.Creational.AbstractFactory.CarExample.car.MicroCar;
import designpattern.Creational.AbstractFactory.CarExample.car.MiniCar;

public class INDIACarFactory
{
    static AbstractCar buildCar(String model)
    {
        AbstractCar car = null;
        switch (model)
        {
            case "MICRO":
                car = new MicroCar("INDIA");
                break;
             
            case "MINI":
                car = new MiniCar("INDIA");
                break;
                 
            case "LUXURY":
                car = new LuxuryCar("INDIA");
                break;
                 
            default:
                break;
             
        }
        return car;
    }
}