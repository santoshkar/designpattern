package designpattern.AbstractFactory.ShapeExample.factory;

import designpattern.AbstractFactory.ShapeExample.AbstractFactory;
import designpattern.AbstractFactory.ShapeExample.IColor;
import designpattern.AbstractFactory.ShapeExample.IShape;
import designpattern.AbstractFactory.ShapeExample.colors.Blue;
import designpattern.AbstractFactory.ShapeExample.colors.Green;
import designpattern.AbstractFactory.ShapeExample.colors.Red;

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
