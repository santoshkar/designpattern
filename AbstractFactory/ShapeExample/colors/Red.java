package designpattern.AbstractFactory.ShapeExample.colors;

import designpattern.AbstractFactory.ShapeExample.IColor;

public class Red implements IColor {

   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}
