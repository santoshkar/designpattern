package designpattern.Creational.AbstractFactory.ShapeExample;

import designpattern.Creational.AbstractFactory.ShapeExample.factory.ColorFactory;
import designpattern.Creational.AbstractFactory.ShapeExample.factory.ShapeFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
         
      }else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      
      return null;
   }
}
