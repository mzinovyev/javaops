public class Wolf {

	private char sex;
	private String nick;
	private String color;
	private short weight;
	private short age;

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(short weight) {
		this.weight = weight;
	}

	public void setAge(short age) {
		if (age > 8) {
			System.out.println("Некоррекный возраст");
		} else {
			this.age = age;
		}
	}

	public char getSex() {
		return sex;
	}

	public String getNick() {
		return nick;
	}

	public String getColor() {
		return color;
	}

	public short getWeight() {
		return weight;
	}

	public short getAge() {
		return age;
	}		

	public void walk() {
		System.out.println("walking wolf");
	}

	public void sit() {
		System.out.println("sitting wolf");
	}

	public void run() {
		System.out.println("running wolf");
	}

	public void howl() {
		System.out.println("howling wolf");
	}

	public void hunt() {
		System.out.println("hunting wolf");
	}
}