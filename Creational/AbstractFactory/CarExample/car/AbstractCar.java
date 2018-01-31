package designpattern.Creational.AbstractFactory.CarExample.car;

public abstract class AbstractCar {
    AbstractCar(String model, String location)
    {
        this.model = model;
        this.location = location;
    }
  
    abstract void construct();
  
    String model = null;
    String location = null;
  
    String getModel()
    {
        return model;
    }
  
    void setModel(String model)
    {
        this.model = model;
    }
  
    String getLocation()
    {
        return location;
    }
  
    void setLocation(String location)
    {
        this.location = location;
    }
  
    @Override
    public String toString()
    {
        return "CarModel - "+model + " located in "+location;
    }
}