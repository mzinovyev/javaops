package com.startjava.lesson_01.calculator;

public class Calculator {
	public static void main(String[] args) {
		// (+, -, *, /, ^, %) над целыми положительными числами
		char operation = '+';
		int num1 = 0;
		int num2 = 0;
		long result = 0;
		// Если в конце программы msg пустой выводим результат, иначе msg
		String msg = "";

		if (operation == '+') {
			result = num1 + num2;
		} else if (operation == '-') {
			result = num1 - num2;
		} else if (operation == '*') {
			result = num1 * num2;
		} else if (operation == '/') {
			if (num2 == 0) {
				msg = "Деление на 0";
			} else {
				result = num1 / num2;
			}
		} else if (operation == '^') {
			// в случае, если степень = 0, результат останентся = 1
			result = 1;
			for (int i = 1; i <= num2; i++) {
				result = result * num1;
			}
		} else if (operation == '%') {
			if (num2 == 0) {
				msg = "Деление на 0";
			} else {
				result = num1 % num2;
			}			
		} else msg = "Операнд не поддерживается";

		if (msg != "") {
			System.out.println(msg);
		}else {
			System.out.println(result);
		}
	}
}