package oca;

public class Car {

	public static void go(testDrive d) {
		d.lap +=10;
	}
	public static void main(String[] args) {
		testDrive dodge = new testDrive();
		go(dodge);
		
		testDrive challenge = dodge;
		go(challenge);
		testDrive viper = challenge;
		go(viper);
		go(dodge);
		System.out.println(dodge.lap);
		System.exit(0);
	}
}
