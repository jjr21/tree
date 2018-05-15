 package ch1;

public class For100Loop {

	public static void main(String[] args) {
		int count = 0;
		int x = 1000;
		while (x > 0) {
			count ++;
			x -= 2;
		}
		System.out.println("Count : " + count);
		
		System.exit(0);
	}
}
