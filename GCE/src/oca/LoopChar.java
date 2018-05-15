package oca;

public class LoopChar {
private static int b =0;

public static void main(String[] args) {
	char word = 'J';
	while(b <8) {
		System.out.print(word);
		word ++;
		b++;
	}
	System.exit(0);
}
}
