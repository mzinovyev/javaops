package com.startjava.lesson_02_03_04.game;

import com.sun.javaws.IconUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int secretNum;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		Random rnd = new Random(System.currentTimeMillis());
		secretNum = rnd.nextInt(100) + 1;
		// Для отладки выводит секретное число
		System.out.println("Загаданное число: " + secretNum);
		System.out.println("У Вас 10 попыток чтобы угадать число");
		for (int i = 0; i < 3; i++) {
			if (makeMoove(player1)) {
				break;
			}
			if (makeMoove(player2)) {
				break;
			}
		}
		System.out.println(Arrays.toString(player1.getAttempts()));
		System.out.println(Arrays.toString(player2.getAttempts()));
	}

	private boolean checkNumber(int num) {
		if (num == secretNum) {
			return true;
		} else if (num > secretNum) {
			System.out.println("Загадочное число меньше " + num);
		} else {
			System.out.println("Загадочное число больше " + num);
		}
		return false;
	}
	// Игорок делает свой ход в игре, если угадал число - возвращаем true
	private boolean makeMoove(Player player) {
		inputNumber(player);
		if (checkNumber(player.getLastNumber())) {
			System.out.println("Игрок " + player.getName() + " угадал число " + player.getLastNumber() + " c " + player.getAttemptCount() + " попытки");
			return true;
		}
		if (player.getAttemptCount() == 3) {
			System.out.println("У " + player.getName() + " закончились попытки");
		}
		return false;
	}
	// Запрашивает число у игрока пока есть попытки
	private void inputNumber(Player player) {
		if (player.getAttemptCount() <= 3) {
			Scanner scan = new Scanner(System.in);
			System.out.print(player.getName() + " введите загаданное число: ");
			player.addNumber(scan.nextInt());
		} else {
			System.out.println("У " + player.getName() + " закончились попытки");
		}
	}
}