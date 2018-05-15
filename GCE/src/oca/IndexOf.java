package oca;

public class IndexOf {

	public static void main(String[] args) {
		String n = "2468";
		int total = 0, c =0;
		total += n.indexOf("6");
		System.out.println(total);
		c += n.indexOf("9");
		System.out.println(c);
		total += c;
		char ch = n.charAt(3);
		System.out.println(total + " " + ch);
		System.exit(0);
	}
}
