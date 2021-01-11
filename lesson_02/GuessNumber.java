import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int secretNum;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		Random rnd = new Random(System.currentTimeMillis());
		secretNum = rnd.nextInt(100) + 1;
		String winner = "";
		do {
			if (checkPlayer(player1)) {
				winner = player1.getName();
				break;
			} else if (checkPlayer(player2)) {
				winner = player2.getName();
			}
		} while (winner.equals(""));
		System.out.println("Победил игрок " + winner);
	}

	private boolean checkSecretNum(int num) {
		if (num == secretNum) {
			return true;
		} else if (num > secretNum) {
			System.out.println("Загадочное число меньше " + num);
		} else {
			System.out.println("Загадочное число больше " + num);
		}
		return false;
	}

	// Если игорок угадал число возвращаем true
	private boolean checkPlayer(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.print(player.getName() + " введите загаданное число: ");
		player.setNumber(scan.nextInt());
		if (checkSecretNum(player.getNumber())) {
			return true;
		}
		return false;
	}
}