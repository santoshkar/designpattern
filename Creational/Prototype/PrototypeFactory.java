package designpattern.Creational.Prototype;

public class PrototypeFactory {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String type : args) {
                Person person = Factory.getPrototype(type);
                if (person != null) {
                    System.out.println(person);
                }
            }
        } else {
            System.out.println("Run again with arguments of command string ");
        }
    }
}
