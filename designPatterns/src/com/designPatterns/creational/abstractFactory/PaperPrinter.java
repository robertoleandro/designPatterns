package com.designPatterns.creational.abstractFactory;

public class PaperPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("paper");
	}

}
