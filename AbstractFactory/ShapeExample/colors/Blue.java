package designpattern.AbstractFactory.ShapeExample.colors;

import designpattern.AbstractFactory.ShapeExample.IColor;

public class Blue implements IColor {

   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}
