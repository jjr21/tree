package ch1;

import java.util.concurrent.ThreadLocalRandom;

public class randomTest {


	public static void main(String[] args) {
		
		
		for (int x=0; x <20; x++) {
			int y = RandomNumber();
			System.out.println(y);
		}
	}
	public static int RandomNumber() {
		int numberRandom = ThreadLocalRandom.current().nextInt(1,3);
		return numberRandom;
	}
}
