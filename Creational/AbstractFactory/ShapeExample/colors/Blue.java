package designpattern.Creational.AbstractFactory.ShapeExample.colors;

import designpattern.Creational.AbstractFactory.ShapeExample.IColor;

public class Blue implements IColor {

   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}
