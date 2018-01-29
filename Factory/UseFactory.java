package designpattern.Factory;

/**
 * Created by Sanosh Kumar Kar on 29-01-2018.
 */
public class UseFactory {
    public static void main(String args[]) {
        Fruit fruit = FruitFactory.makeFruit("Apple");
        fruit.makeJuice();
    }
}
