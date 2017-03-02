package com.designPatterns.creational.singleton;

public class Main {
	
	public static void main(String[] args) {
		MainWindow object = MainWindow.getInstance();
		
		object.showMessage();
	}
}
