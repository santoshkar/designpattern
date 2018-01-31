package designpattern.Creational.AbstractFactory.ShapeExample.colors;

import designpattern.Creational.AbstractFactory.ShapeExample.IColor;

public class Red implements IColor {

   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}
