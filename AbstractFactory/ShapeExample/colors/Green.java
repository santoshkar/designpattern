package designpattern.AbstractFactory.ShapeExample.colors;

import designpattern.AbstractFactory.ShapeExample.IColor;

public class Green implements IColor {

   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}
