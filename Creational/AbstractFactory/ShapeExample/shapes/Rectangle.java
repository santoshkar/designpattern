package designpattern.Creational.AbstractFactory.ShapeExample.shapes;

import designpattern.Creational.AbstractFactory.ShapeExample.IShape;

public class Rectangle implements IShape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
