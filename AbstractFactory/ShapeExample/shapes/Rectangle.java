package designpattern.AbstractFactory.ShapeExample.shapes;

import designpattern.AbstractFactory.ShapeExample.IShape;

public class Rectangle implements IShape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
