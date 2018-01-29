package designpattern.AbstractFactory.ComputerExample;

import designpattern.AbstractFactory.ComputerExample.factory.ComputerFactory;
import designpattern.AbstractFactory.ComputerExample.factory.PCFactory;
import designpattern.AbstractFactory.ComputerExample.factory.ServerFactory;

public class TestDesignPatterns {

	public static void main(String[] args) {
        testAbstractFactory();
	}

	private static void testAbstractFactory() {
		AbstractComputer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		AbstractComputer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}
}
