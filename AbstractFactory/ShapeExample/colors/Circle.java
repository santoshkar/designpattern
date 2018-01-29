package designpattern.AbstractFactory.ShapeExample.colors;

import designpattern.AbstractFactory.ShapeExample.IShape;

public class Circle implements IShape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
