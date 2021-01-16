package com.startjava.lesson_02_03_04.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String answer = "нет";
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Введите операнды и операцию разделяя пробелом (напр: 1 + 1): ");
			String expression = scan.nextLine();
			Calculator calc = new Calculator();
			System.out.println(calc.calculate(expression));

			do {
				System.out.print("Хотите продолжить вычисления? [да/нет]: ");
				answer = scan.next();
			} while (!answer.equals("да") && !answer.equals("нет"));
		} while (answer.equals("да"));
	}
}