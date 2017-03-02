package com.designPatterns.creational.abstractFactory;

public abstract class AbstractFactory {

	abstract Printer getPrinter(String type);
	abstract Shape getShape(String shape);
}
