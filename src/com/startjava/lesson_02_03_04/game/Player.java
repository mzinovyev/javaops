package com.startjava.lesson_02_03_04.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] numbers;
	private int attemptCount; //кол-во поптыок = индекс последнего введенного числа

	public Player(String name) {
		this.name = name;
		numbers = new int[10];
	}

	public String getName() {
		return name;
	}

	public void addNumber(int number) {
		numbers[attemptCount++] = number;
	}
	
	public int getLastNumber() {
		return numbers[attemptCount - 1];
	}

	// Возвращает кол-во чисел загаданных игороком
	public int getAttemptCount() {
		return attemptCount;
	}

	// Возвращает список чисел
	public int[] getNumbers() {
		return Arrays.copyOf(numbers, attemptCount);
	}
}