package designpattern.AbstractFactory.ComputerExample.factory;

import designpattern.AbstractFactory.ComputerExample.AbstractComputer;

public class ComputerFactory {

	public static AbstractComputer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
	}
}
