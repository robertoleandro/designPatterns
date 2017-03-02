package com.designPatterns.structural.adapter;

public class Main {

	public static void main(String[] args) {
		MyPlayer player = new MyPlayer();
		player.play("mp3", "Nirvana");
		player.play("avi", "catch me if you can");
	}

}
