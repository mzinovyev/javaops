import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int secretNum;
	private Player[] players;

	public GuessNumber(long seed, int numOfPlayers) {
		Random rnd = new Random(seed);
		secretNum = rnd.nextInt(100) + 1;
		players = new Player[numOfPlayers];
	}

	public void startGame() {
		initPlayers();
		String winner = "";
		do {
			for (int i=0; i<players.length; i++) {
				players[i].setNumber();
				if (checkSecretNum(players[i].getNumber())) {
					winner = players[i].getName();
					break;
				}
			}
		} while (winner.equals(""));
		System.out.println("Победил игрок" + winner);
	}

	private void initPlayers() {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<players.length; i++) {
			System.out.print("Введите имя игрока " + i + ": ");
			players[i] = new Player(scan.nextLine());
		}
	}	

	public boolean checkSecretNum(int num) {
		if (num == secretNum) {
			return true;
		} else if (num > secretNum) {
			System.out.println("Загадочное число меньше " + num);
		} else {
			System.out.println("Загадочное число больше " + num);
		}
		return false;
	}
}