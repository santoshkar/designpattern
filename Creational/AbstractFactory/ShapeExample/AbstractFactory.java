package designpattern.Creational.AbstractFactory.ShapeExample;

public abstract class AbstractFactory {
   public abstract IColor getColor(String color);
   public abstract IShape getShape(String shape) ;
}
