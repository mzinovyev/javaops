public class Cycle {
	public static void main(String[] args) {

		// printing digits from 0 to 20
		for(int i = 0; i<21; i++) {
			System.out.println(i);
		}

		//printing digits fron 6 downtow -6 with step 2
		byte i = 6;
		while(i > -7) {
			System.out.println(i);
			i -= 2;
		}

		//get sum of even digits from 10 to 20
		byte sum = 0;
		byte startNumber = 10;
		do {
			if (startNumber % 2 ==0) {
				sum += startNumber;
			}
			startNumber += 1;
		} while (startNumber < 21);
		System.out.println(sum);
	}
}