package designpattern.Creational.AbstractFactory.CarExample.car;

public class MiniCar extends AbstractCar
{
    public MiniCar(String location)
    {
        super("MINI",location );
        construct();
    }
     
    @Override
    public void construct()
    {
        System.out.println("Constructing Mini car");
    }
}