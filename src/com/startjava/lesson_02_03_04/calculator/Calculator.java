package com.startjava.lesson_02_03_04.calculator;

import static java.lang.Math.*;

public class Calculator {
	public long calculate(String expression) {
		String[] exprArr = expression.split(" ");
		int num1 = Integer.parseInt(exprArr[0]);
		int num2 = Integer.parseInt(exprArr[2]);
		char operation = exprArr[1].charAt(0);
		switch(operation) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return multiplyExact(num1, num2);
			case '/':
				return num1 / num2;
			case '^':
				return (long) pow(Double.parseDouble(exprArr[0]), Double.parseDouble(exprArr[2]));
			case '%':
				return num1 % num2;
			default:
				System.out.println("Недопустимая операция: " + operation);
				return 0;
		}
	}
}