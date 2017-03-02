package com.designPatterns.creational.abstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		if(shape == null){
			return null;
		}
		
		if(shape.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		
		if(shape.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		
		if(shape.equalsIgnoreCase("Square")){
			return new Square();
		}
		
		return null;
	}
	
	@Override
	Printer getPrinter(String type) {
		return null;
	}

}
