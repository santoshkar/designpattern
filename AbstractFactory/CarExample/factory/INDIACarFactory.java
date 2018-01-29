package designpattern.AbstractFactory.CarExample.factory;

import designpattern.AbstractFactory.CarExample.car.AbstractCar;
import designpattern.AbstractFactory.CarExample.car.LuxuryCar;
import designpattern.AbstractFactory.CarExample.car.MicroCar;
import designpattern.AbstractFactory.CarExample.car.MiniCar;

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