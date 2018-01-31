package designpattern.Creational.AbstractFactory.ShapeExample.colors;

import designpattern.Creational.AbstractFactory.ShapeExample.IShape;

public class Circle implements IShape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
