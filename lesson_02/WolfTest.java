public class WolfTest {

	public static void main(String[] args) {
		Wolf akella = new Wolf();

		akella.setSex('M');
		akella.setNick("Akella");
		akella.setColor("red");
		akella.setWeight((short)40);
		akella.setAge((short) 9);

		System.out.println(akella.getSex());
		System.out.println(akella.getNick());
		System.out.println(akella.getColor());
		System.out.println(akella.getWeight());
		System.out.println(akella.getAge());

		akella.walk(); 
		akella.sit();
		akella.run();
		akella.howl(); 
		akella.hunt();
	}
}