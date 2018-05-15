package ch1;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class TestRandom {

	public static void main(String[] args) {
		
		int count;
		Random randomCount = new Random();
		count = randomCount.nextInt(500);
		
		for (int x = 0; x<55; x++) {
		int randomNum = ThreadLocalRandom.current().nextInt(1,7);
		System.out.println(randomNum);
		
	}
}
}
