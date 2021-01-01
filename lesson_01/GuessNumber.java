public class GuessNumber {
	// интервал цифр (0, 100] представляем в виде отрезка
	// с началльной координатой 0 и конечно 100
	// каждый раз отрезок разбирваем пополам и узнаем в какой части отрезка
	// загаданное число
	public static void main(String[] args) {
		// псевдослучайное число (0..100]
		long secretNum = System.currentTimeMillis() % 99L + 1;
		System.out.println("---------------------------------");
		//System.out.println("Загаданное число: " + Long.toString(secretNum));
		System.out.println("Загаданное число: " + secretNum);

		float startRange = 0F;
		float endRange = 100F;
		// середина отрезка - вводится чтобы угадать искомое
		float userNum = 50;

		while (true) {
			// при поиске числа, кажый раз определяем в какой половине ряда находится число
			System.out.println("\nЭто число: " + (long) userNum + "?" + "  (" + userNum + ")\n");
			if ((long) userNum == secretNum) {
				break;
			} else if (secretNum > userNum) {
				System.out.println("Введенное число меньше загаданного компьютером");
				// Искомое число правее от Введенного
				printSection(startRange, endRange, userNum, '>');
				// В след. раз берем число N из верхнгего интервала чисел startRange-------|---N----endRange
				startRange = userNum;
			} else {
				System.out.println("Введенное число больше загаданного компьютером");
				// Искомое число левее от Введенного
				printSection(startRange, endRange, userNum, '<');
				// В след. раз берем число N из верхнгего интервала чисел startRange---N---|-------endRange
				endRange = userNum;
			}
			userNum = startRange + ((endRange - startRange) / 2);
		}
		System.out.println("Вы угадали!");
	}

	public static void printSection(float a, float b, float userNum, char sign) {
		// для удобства отладки, функция печатет в какой части отрезка мы ищем число
		String side = "Левой";
		String leftSide = "---------| ";
		String rightSide = " |---------";
		if (sign == '>') {
			side = "Правой";
			rightSide = " |----X----";
		} else if (sign == '<') {
			side = "Левой";
			leftSide = "----X----| ";
		} 
		System.out.print("Иcкомое число в " + side + " части отрезка ");
		System.out.println(a + leftSide + (long) userNum + rightSide + b);
	}	
}

