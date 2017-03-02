package com.designPatterns.creational.abstractFactory;

public class Main {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("square");
		shape3.draw();
		
		AbstractFactory printerFactory = FactoryProducer.getFactory("printer");
		
		Printer printer1 = printerFactory.getPrinter("paper");
		printer1.print();
		
		Printer printer2 = printerFactory.getPrinter("web");
		printer2.print();
		
		Printer printer3 = printerFactory.getPrinter("screen");
		printer3.print();
	}
}
