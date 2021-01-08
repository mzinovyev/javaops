import java.util.Random;

public class GuessNumber {
	private int secretNum;

	public GuessNumber(long seed) {
		Random rnd = new Random(seed);
		secretNum = rnd.nextInt(100) + 1;
	}

	public int getSecretNum() {
		return secretNum;
	}

	public boolean checkSecretNum(int num) {
		if (num == secretNum) {
			return true;
		} else if (num > secretNum) {
			System.out.println("Загадочное число меньше " + num);
			return false;
		} else {
			System.out.println("Загадочное число больше " + num);
			return false;
		}
	}
}