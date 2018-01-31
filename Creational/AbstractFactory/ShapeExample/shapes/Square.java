package designpattern.Creational.AbstractFactory.ShapeExample.shapes;

import designpattern.Creational.AbstractFactory.ShapeExample.IShape;

public class Square implements IShape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
