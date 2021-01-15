package com.startjava.lesson_02_03_04.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String continueGame = "нет";
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Введите имя игрока 1: ");
			Player player1 = new Player(scan.nextLine());
			System.out.print("Введите имя игрока 2: ");
			Player player2 = new Player(scan.nextLine());			

			GuessNumber game = new GuessNumber(player1, player2);
			game.start();
			do {
				System.out.print("Хотите продолжить игру? [да/нет]: ");
				continueGame = scan.next();
			} while (!continueGame.equals("да") && !continueGame.equals("нет"));			
		} while (continueGame.equals("да"));
	}
}