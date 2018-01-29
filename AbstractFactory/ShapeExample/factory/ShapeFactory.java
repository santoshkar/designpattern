package designpattern.AbstractFactory.ShapeExample.factory;

import designpattern.AbstractFactory.ShapeExample.AbstractFactory;
import designpattern.AbstractFactory.ShapeExample.IColor;
import designpattern.AbstractFactory.ShapeExample.IShape;
import designpattern.AbstractFactory.ShapeExample.colors.Circle;
import designpattern.AbstractFactory.ShapeExample.shapes.Rectangle;
import designpattern.AbstractFactory.ShapeExample.shapes.Square;

public class ShapeFactory extends AbstractFactory {

   @Override
   public IShape getShape(String shapeType){
   
      if(shapeType == null){
         return null;
      }		
      
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
   
   @Override
   public IColor getColor(String color) {
      return null;
   }
}
