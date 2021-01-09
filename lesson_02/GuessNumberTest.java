import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String continueGame = "нет";
		do {	
			GuessNumber game = new GuessNumber(System.currentTimeMillis(), 2);
			game.startGame();
			do {
				Scanner scan = new Scanner(System.in);
				System.out.print("Хотите продолжить игру? [да/нет]: ");
				continueGame = scan.next();
			} while (!continueGame.equals("да") && !continueGame.equals("нет"));			
		} while (continueGame.equals("да"));
	}
}