package designpattern.Creational.AbstractFactory.ComputerExample.factory;

import designpattern.Creational.AbstractFactory.ComputerExample.AbstractComputer;
import designpattern.Creational.AbstractFactory.ComputerExample.Server;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
    private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public AbstractComputer createComputer() {
		return new Server(ram,hdd,cpu);
	}

}
