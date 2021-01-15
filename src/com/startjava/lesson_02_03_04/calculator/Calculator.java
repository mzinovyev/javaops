package com.startjava.lesson_02_03_04.calculator;

import java.lang.Math;

import static java.lang.Math.*;

public class Calculator {
	public long calculate(String[] exprArr) {
		//int num1, char operation, int num2
		char operation = exprArr[1].charAt(0);
		switch(operation) {
			case '+':
				return Integer.parseInt(exprArr[0]) + Integer.parseInt(exprArr[2]);
			case '-':
				return Integer.parseInt(exprArr[0]) - Integer.parseInt(exprArr[2]);
			case '*':
				return multiplyExact(Integer.parseInt(exprArr[0]), Integer.parseInt(exprArr[2]));
			case '/':
				return Integer.parseInt(exprArr[0]) / Integer.parseInt(exprArr[2]);
			case '^':
				return (long) pow(Double.parseDouble(exprArr[0]), Double.parseDouble(exprArr[2]));
			case '%':
				return Integer.parseInt(exprArr[0]) % Integer.parseInt(exprArr[2]);
			default:
				System.out.println("Недопустимая операция: " + operation);
				return 0;
		}
	}
}