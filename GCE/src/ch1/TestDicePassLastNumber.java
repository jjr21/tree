package ch1;

import java.util.Random;

public class TestDicePassLastNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int dice, dice2, max, add, overAgain;
		int total = 0;
		for(int x=0; x<5; x++) {
		dice = random.nextInt(10);
		dice2 = random.nextInt(10);
		max = 20;
		add = dice + dice2;
		System.out.println("add"+add);
		total = total + add;
		if(total >= max) {
			overAgain = total - max;
			System.out.println("OverAgain" + overAgain);
			total = 0 + overAgain;
			System.out.println("total:" + total);
			continue;
		}
		System.out.println("Count " + total);
		
		}
	}
}
