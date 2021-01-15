package com.startjava.lesson_02_03_04.game;

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
		String winner = "";
		do {
			if (makeMoove(player1)) {
				winner = player1.getName();
				break;
			}
			if (makeMoove(player2)) {
				winner = player2.getName();
				break;
			}
		} while (true);
		System.out.println("Победил игрок " + winner);
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
		if (checkNumber(player.getNumber())) {
			return true;
		}
		return false;
	}

	private void inputNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.print(player.getName() + " введите загаданное число: ");
		player.setNumber(scan.nextInt());		
	}
}