package com.designPatterns.creational.abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("shape")){
			return new ShapeFactory();
		}
		if(choice.equalsIgnoreCase("printer")){
			return new PrinterFactory();
		}
		
		return null;
	}
}