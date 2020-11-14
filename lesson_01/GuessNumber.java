public class Guess {
	// интервал цифр (0, 100] представляем в виде отрезка
	// с началльной координатой 0 и конечно 100
	// каждый раз отрезок разбирваем пополам и узнаем в какой части отрезка
	// загаданное число

	public static void prSec (float a, float b, float num, char sign) {
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
		} else {
			System.out.println("Неверный параметр sign");
		}
		System.out.print("Иcкомое число в " + side + " части отрезка ");
		System.out.println(Float.toString(a) + leftSide + Long.toString((long) num) + rightSide + Float.toString(b));
	}	

	public static void main(String[] args) {
		// псевдослучайное число (0..100]
		long secret = System.currentTimeMillis() % 99L + 1;
		System.out.println("---------------------------------");
		System.out.println("Загаданное число: " + Long.toString(secret));

		// начало отрезка
		float a = 0F;
		// конец отрезка
		float b = 100F;
		// середина отрезка - вводится чтобы угадать искомое
		float num = 50;

		while (true) {
			// при поиске числа, кажый раз определяем в какой половине ряда находится число
			System.out.println("\nЭто число: " + Long.toString((long)num) + "?" + "  (" + Float.toString(num) + ")\n");
			if ((long)num == secret) {
				System.out.println("Вы угадали!");
				break;
			} else if (secret > num) {
				System.out.println("Введенное число меньше загаданного компьютером");
				// Искомое число правее от Введенного
				prSec(a, b, num, '>');
				// В след. раз берем число N из верхнгего интервала чисел a-------|---N----b
				a = num;
			} else {
				System.out.println("Введенное число больше загаданного компьютером");
				// Искомое число левее от Введенного
				prSec(a, b, num, '<');
				// В след. раз берем число N из верхнгего интервала чисел a---N---|-------b
				b = num;
			}
			num = a + ((b-a) / 2);
		}
	}
}