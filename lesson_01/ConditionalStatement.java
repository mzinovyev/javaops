public class ConditionalStatement {
	public static void main (String[] args) {
		byte personAge = 35;
		char personSex = 'W';
		float personHeight = 1.85F;
		char personNameFirstLetter = 'M';

		if (personAge > 20) {
			System.out.println("Person age is above 20 years");
		}
		
		if (personSex == 'M') {
			System.out.println("Person sex is Man");
		}

		if !(personSex == 'M') {
			System.out.println("Person sex is Wooman");
		}

		if (personHeight < 1.80) {
			System.out.println("Person height is less then 180 cm");
		} else {
			System.out.println("Person height is equal or above then 180 cm");
		}

		if (personNameFirstLetter == 'M') {
			System.out.println("Person name first letter is 'M'");
		} else if (personNameFirstLetter == 'I') {
			System.out.println("Person name first letter is 'I'");
		} else {
			System.out.println("Person name first letter is neither 'M' nor 'I' ");
		}
	}
}