package oca;

public class ArrayOutOfBound {

	public static void main(String[] args) {
		//String [] d = {"Duck", "Duck", "Goose"};
		for (int i = 1; i <= args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
