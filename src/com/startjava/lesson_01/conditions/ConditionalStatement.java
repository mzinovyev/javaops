package com.startjava.lesson_01.conditions;

public class ConditionalStatement {
	public static void main(String[] args) { // !-- После ф-ии не ставить пробел
// !-- Не ставить строки после переменных
		byte age = 35;
		if (age > 20) {
			System.out.println("Person age is above 20 years");
		}

		char sex = 'W';		
		if (sex == 'M') {
			System.out.println("Person sex is Man");
		}

		if (sex != 'M') {
			System.out.println("Person sex is Wooman");
		}

		float height = 1.85F;
		if (height < 1.80) {
			System.out.println("Person height is less then 180 cm");
		} else {
			System.out.println("Person height is equal or above then 180 cm");
		}

		char firstLetter = 'M';
		if (firstLetter == 'M') {
			System.out.println("Person name first letter is 'M'");
		} else if (firstLetter == 'I') {
			System.out.println("Person name first letter is 'I'");
		} else {
			System.out.println("Person name first letter is neither 'M' nor 'I' ");
		}
	}
}