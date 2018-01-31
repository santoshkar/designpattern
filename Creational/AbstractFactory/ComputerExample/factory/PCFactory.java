package designpattern.Creational.AbstractFactory.ComputerExample.factory;

import designpattern.Creational.AbstractFactory.ComputerExample.AbstractComputer;
import designpattern.Creational.AbstractFactory.ComputerExample.PC;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
    private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public AbstractComputer createComputer() {
		return new PC(ram,hdd,cpu);
	}

}
