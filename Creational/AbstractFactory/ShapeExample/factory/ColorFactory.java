package designpattern.Creational.AbstractFactory.ShapeExample.factory;

import designpattern.Creational.AbstractFactory.ShapeExample.AbstractFactory;
import designpattern.Creational.AbstractFactory.ShapeExample.IColor;
import designpattern.Creational.AbstractFactory.ShapeExample.IShape;
import designpattern.Creational.AbstractFactory.ShapeExample.colors.Blue;
import designpattern.Creational.AbstractFactory.ShapeExample.colors.Green;
import designpattern.Creational.AbstractFactory.ShapeExample.colors.Red;

public class ColorFactory extends AbstractFactory {

   @Override
   public IShape getShape(String shapeType){
      return null;
   }
   
   @Override
   public IColor getColor(String color) {
   
      if(color == null){
         return null;
      }		
      
      if(color.equalsIgnoreCase("RED")){
         return new Red();
         
      }else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
         
      }else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      
      return null;
   }
}
