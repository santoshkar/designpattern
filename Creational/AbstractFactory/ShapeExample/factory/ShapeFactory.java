package designpattern.Creational.AbstractFactory.ShapeExample.factory;

import designpattern.Creational.AbstractFactory.ShapeExample.AbstractFactory;
import designpattern.Creational.AbstractFactory.ShapeExample.IColor;
import designpattern.Creational.AbstractFactory.ShapeExample.IShape;
import designpattern.Creational.AbstractFactory.ShapeExample.colors.Circle;
import designpattern.Creational.AbstractFactory.ShapeExample.shapes.Rectangle;
import designpattern.Creational.AbstractFactory.ShapeExample.shapes.Square;

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
