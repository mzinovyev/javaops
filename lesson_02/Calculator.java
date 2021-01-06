public class Calculator {
	private char operation;
	private int num1;
	private int num2;

	public Calculator(int num1, char operation, int num2) {
		this.num1 = num1;
		this.operation = operation;
		this.num2 = num2;
	}

	public long calc() {
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
					result = result * num1;
				}
				break;
			case '%':
				result = num1 % num2;
				break;
		}
		return result;
	}

}