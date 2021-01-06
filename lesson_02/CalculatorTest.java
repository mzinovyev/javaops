import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		char operation = 'X';
		int num1 = 0;
		int num2 = 0;
		boolean calcNext = true;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Введите первое число: ");
			num1 = scan.nextInt();

			System.out.print("Введите знак математической операции: ");
			operation = scan.next().charAt(0);

			System.out.print("Введите второе число: ");
			num2 = scan.nextInt();

			Calculator calc = new Calculator(num1, operation, num2);
			System.out.println(calc.calc());

			boolean correctAnswer = true;
			while (true) {
				System.out.print("Хотите продолжить вычисления? [да/нет]: ");
				String answer = scan.next();
				if (answer.equals("да")) {
					calcNext = true;
					break;
				} else if (answer.equals("нет")) {
					calcNext = false;
					break;
				}
			}
		} while (calcNext);
	}
}