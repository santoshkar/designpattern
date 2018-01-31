package designpattern.Creational.AbstractFactory.ComputerExample.factory;

import designpattern.Creational.AbstractFactory.ComputerExample.AbstractComputer;

public class ComputerFactory {

	public static AbstractComputer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
	}
}
