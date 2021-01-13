public class Calculator {
	public long calculate(int num1, char operation, int num2) {
		switch(operation) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / num2;
			case '^':
				// в случае, если степень = 0, результат останентся = 1
				long result = 1;
				for (int i = 1; i <= num2; i++) {
					result *= num1;
				}
				return result;
			case '%':
				return num1 % num2;
			default:
				System.out.println("Недопустимая операция: " + operation);
				return 0;
		}
	}
}