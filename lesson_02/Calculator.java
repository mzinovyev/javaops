public class Calculator {
	public long calculate(int num1, char operation, int num2) {
		long result = 0;
		switch(operation) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '^':
				// в случае, если степень = 0, результат останентся = 1
				result = 1;
				for (int i = 1; i <= num2; i++) {
					result *= num1;
				}
				break;
			case '%':
				result = num1 % num2;
				break;
		}
		return result;
	}

}