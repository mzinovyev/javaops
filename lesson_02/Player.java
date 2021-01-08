import java.util.Scanner;

public class Player {
	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print(name + " введите загаданное число: ");
		number = scan.nextInt();
	}
	public int getNumber() {
		return number;
	}
}