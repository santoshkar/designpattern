package designpattern.Creational.AbstractFactory.CarExample.car;

public class MicroCar extends AbstractCar
{
    public MicroCar(String location)
    {
        super("MICRO", location);
        construct();
    }
    @Override
    public void construct()
    {
        System.out.println("Constructing  Micro AbstractCar ");
    }
}