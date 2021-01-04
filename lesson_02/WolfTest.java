public class WolfTest {

	public static void main (String[] args) {

		Wolf akella = new Wolf();

		akella.sex = 'M';
		akella.nick = "Akella";
		akella.color = "red";
		akella.weight = 40;
		akella.age = 7;

		System.out.println(akella.sex);
		System.out.println(akella.nick);
		System.out.println(akella.color);
		System.out.println(akella.weight);
		System.out.println(akella.age);

		akella.walk(); 
		akella.sit();
		akella.run();
		akella.howl(); 
		akella.hunt();
	}
}