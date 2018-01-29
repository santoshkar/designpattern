package designpattern.AbstractFactory.ShapeExample.shapes;

import designpattern.AbstractFactory.ShapeExample.IShape;

public class Square implements IShape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
