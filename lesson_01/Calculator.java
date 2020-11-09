public class Calculator {
	public static void main(String[] args) {
		// (+, -, *, /, ^, %) над целыми положительными числами
		char operand = '+';
		int opA = -1;
		int opB = -1;
		long result = -1;
		// Если в конце программы msg пустой выводим результат, иначе msg
		String msg = "";

		if (operand == '+') {
			result = opA + opB;
		} else if (operand == '-') {
			result = opA - opB;
		} else if (operand == '*') {
			result = opA * opB;
		} else if (operand == '/') {
			if (opB == 0) {
				msg = "Деление на 0";
			} else {
				result = opA / opB;
			}
		} else if (operand == '^') {
			// в случае, если степень = 0, результат останентся = 1
			result = 1;
			for (int i = 1; i <= opB; i++) {
				result = result * opA;
			}
		} else if (operand == '%') {
			if (opB == 0) {
				msg = "Деление на 0";
			} else {
				result = opA % opB;
			}			
		} else msg = "Операнд не поддерживается";

		if (msg != "") {
			System.out.println(msg);
		}else {
			System.out.println(result);
		}
	}
}