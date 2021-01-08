import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String continueGame = "нет";
		do {	
			Scanner scan = new Scanner(System.in);			
			System.out.print("Введите имя первого игрока: ");
			Player p1 = new Player(scan.next());
			System.out.print("Введите имя второго игрока: ");
			Player p2 = new Player(scan.next());
			GuessNumber game = new GuessNumber(System.currentTimeMillis());

			String winner = "";
			do {
				p1.setNumber();
				if (game.checkSecretNum(p1.getNumber())) {
					winner = p1.getName();
					break;
				}
				p2.setNumber();
				if (game.checkSecretNum(p2.getNumber())) {
					winner = p2.getName();
				}
			} while (winner.equals(""));
			System.out.println("Победил " + winner);

			do {
				System.out.print("Хотите продолжить игру? [да/нет]: ");
				continueGame = scan.next();
			} while (!continueGame.equals("да") && !continueGame.equals("нет"));			
		} while (continueGame.equals("да"));
		
	}
}