public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;
	private String pilots;
	private String weapon1;
	private String weapon2;

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName; 	
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getWeight() {
		return weight;
	}	

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

	public void setArmor(int armor) {
		this.armor = armor;	
	}

	public int getArmor() {
		return armor;	
	}

	public void setPilots(String pilots) {
		this.pilots = pilots;
	}

	public String getPilots() {
		return pilots;
	}

	public void setWeapon1(String weapon1) {
		this.weapon1 = weapon1;
	}

	public String getWeapon1() {
		return weapon1;
	}

	public void setWeapon2(String weapon2) {
		this.weapon2 = weapon2;	
	}

	public String getWeapon2() {
		return weapon2;	
	}

	void drift() {
		System.out.println("Drift with pilots " + pilots);
	}

	void move() {
		System.out.println("Jaeger move with max speed " + speed);
	}

	String scanKaiju() {
		return "Uncknown kaiju detected";
	}

	void useWeapon() {
		System.out.println("Attack with " + weapon1);
		System.out.println("Attack with " + weapon2);		
	}
}