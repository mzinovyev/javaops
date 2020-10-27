public class Cycle {
	public static void main(String[] args) {
		// printing digits from 0 to 20
		for(int i = 0; i < 21; i++) {
			System.out.println(i);
		}

		//printing digits fron 6 downtow -6 with step 2
		byte counter = 6;
		while(counter > -7) {
			System.out.println(counter);
			counter -= 2;
		}

		//get sum of even digits from 10 to 20
		byte sum = 0;
		counter = 10;
		do {
			if (counter % 2 == 0) {
				sum += counter;
			}
			counter++;
		} while (counter < 21);
		System.out.println(sum);
	}
}