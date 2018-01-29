package designpattern.AbstractFactory.CarExample.car;

public class LuxuryCar extends AbstractCar
{
    public LuxuryCar(String location)
    {
        super("LUXURY", location);
        construct();
    }
    @Override
    public void construct()
    {
        System.out.println("Constructing luxury car");
    }
}