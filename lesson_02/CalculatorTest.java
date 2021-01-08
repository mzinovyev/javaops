import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String answer = "нет";
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Введите первое число: ");
			int num1 = scan.nextInt();

			System.out.print("Введите знак математической операции: ");
			char operation = scan.next().charAt(0);

			System.out.print("Введите второе число: ");
			int num2 = scan.nextInt();

			Calculator calc = new Calculator();
			System.out.println(calc.calculate(num1, operation, num2));

			do {
				System.out.print("Хотите продолжить вычисления? [да/нет]: ");
				answer = scan.next();
			} while (!answer.equals("да") & !answer.equals("нет"));
		} while (answer.equals("да"));
	}
}