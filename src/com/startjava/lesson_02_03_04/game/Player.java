package com.startjava.lesson_02_03_04.game;

public class Player {
	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
}