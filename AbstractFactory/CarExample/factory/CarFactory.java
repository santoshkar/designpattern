package designpattern.AbstractFactory.CarExample.factory;

import designpattern.AbstractFactory.CarExample.car.AbstractCar;

public class CarFactory
{
    private CarFactory() 
    {
         
    }
    public static AbstractCar buildCar(String type)
    {
        AbstractCar car = null;
        // We can add any GPS Function here which
        // read location property somewhere from configuration
        // and use location specific car Factory
        // Currently I'm just using INDIA as Location
        String location = "INDIA";
         
        switch(location)
        {
            case "USA":
                car = USACarFactory.buildCar(type);
                break;
                 
            case "INDIA":
                car = INDIACarFactory.buildCar(type);
                break;
                     
            default:
                car = DefaultCarFactory.buildCar(type);
 
        }
         
        return car;
 
    }
}