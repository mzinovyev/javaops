package com.startjava.lesson_02_03_04.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] numbers;
	private int nextIndex; //индекс последнего введенного числа

	public Player(String name) {
		this.name = name;
		numbers = new int[3];
		nextIndex = 0;
	}

	public String getName() {
		return name;
	}

	public void addNumber(int number) {
		numbers[nextIndex++] = number;
	}
	
	public int getLastNumber() {
		return numbers[nextIndex-1];
	}
	// Возвращает кол-во чисел загаданных игороком
	public int getAttemptCount() {
		return nextIndex;
	}
	// Возвращает список чисел
	public int[] getAttempts() {
		return Arrays.copyOf(numbers, nextIndex);
	}
}