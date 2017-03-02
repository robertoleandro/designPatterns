package com.designPatterns.creational.singleton;

public class MainWindow {

	private static MainWindow instance = new MainWindow();
	
	private MainWindow(){}
	
	public static MainWindow getInstance(){
		return instance;
	}
	
	void showMessage(){
		System.out.println("Hello World");
	}
	
	
}
