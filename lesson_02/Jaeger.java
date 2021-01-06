public class Jaeger {
	String modelName;
	String mark;
	String origin;
	float height;
	float weight;
	int speed;
	int strength;
	int armor;
	String pilots;
	String weapon1;
	String weapon2;

	void setTechInfo(String modelName, String mark, String origin) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
	}

	void setSpecifications(float height, float weight, int speed, int strength, int armor) {
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;		
	}

	void setWeapons(String weapon1, String weapon2) {
		this.weapon1 = weapon1;
		this.weapon2 = weapon2;		
	}

	void setPilots(String pilots) {
		this.pilots = pilots;
	}

	String getName() {
		return modelName;
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