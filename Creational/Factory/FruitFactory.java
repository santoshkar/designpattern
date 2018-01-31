package designpattern.Creational.Factory;

/**
 * Created by Santosh Kumar Kar on 29-01-2018.
 */
public class FruitFactory {
    public static Fruit makeFruit(String fruitType){
        if(fruitType.equals("Mango"))
            return new MangoFruit();
        else if(fruitType.equals("Apple"))
            return new AppleFruit();
        else
            return null;
    }
}
