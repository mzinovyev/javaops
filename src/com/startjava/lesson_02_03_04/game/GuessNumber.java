package com.startjava.lesson_02_03_04.game;

import com.sun.javaws.IconUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int secretNum;
	private Player player1;
	private Player player2;
	private int rounds;

	public GuessNumber(Player player1, Player player2, int rounds) {
		this.player1 = player1;
		this.player2 = player2;
		this.rounds = rounds;
	}

	public void start() {
		Random rnd = new Random(System.currentTimeMillis());
		secretNum = rnd.nextInt(100) + 1;
		// Для отладки выводит секретное число
		System.out.println("Загаданное число: " + secretNum);
		System.out.println("У Вас 10 попыток чтобы угадать число");
		for (int i = 0; i < rounds; i++) {
			if (makeMove(player1)) {
				break;
			}
			if (makeMove(player2)) {
				break;
			}
		}
		printEnteredNumbers(player1.getNumbers());
		printEnteredNumbers(player2.getNumbers());
	}

	// Игорок делает свой ход в игре, если угадал число - возвращаем true
	private boolean makeMove(Player player) {
		inputNumber(player);
		if (checkNumber(player.getLastNumber())) {
			System.out.println("Игрок " + player.getName() + " угадал число " + player.getLastNumber() + " c " + player.getAttemptCount() + " попытки");
			return true;
		}
		if (player.getAttemptCount() == rounds) {
			System.out.println("У " + player.getName() + " закончились попытки");
		}
		return false;
	}

	// Запрашивает число у игрока пока есть попытки
	private void inputNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.print(player.getName() + " введите загаданное число: ");
		player.addNumber(scan.nextInt());
	}

	private boolean checkNumber(int num) {
		if (num == secretNum) return true;
		System.out.println("Загадочное число " + (num > secretNum ? "меньше " : "больше ") + num);
		return false;
	}

	private void printEnteredNumbers(int[] numbers) {
		for(int num : numbers) {
			System.out.println(num + " ");
		}
		System.out.print("\n");
	}
}