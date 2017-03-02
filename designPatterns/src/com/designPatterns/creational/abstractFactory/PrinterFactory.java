package com.designPatterns.creational.abstractFactory;

public class PrinterFactory extends AbstractFactory {

	@Override
	Printer getPrinter(String type) {
		if(type == null){
			return null;
		}
		
		if(type.equalsIgnoreCase("paper")){
			return new PaperPrinter();
		}
		
		if(type.equalsIgnoreCase("web")){
			return new WebPrinter();
		}
		
		if(type.equalsIgnoreCase("screen")){
			return new ScreenPrinter();
		}
		
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
