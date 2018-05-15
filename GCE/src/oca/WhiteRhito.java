package oca;

public class WhiteRhito extends BlackRhino {
	public WhiteRhito(int age) {
		System.out.println("Num " +age);
		
	}
	public WhiteRhito(String s) {
		System.out.println("String method"+ s);
	}
	public WhiteRhito() {
		//this(22);
		this("s");
		
		
		System.out.println("White Rhino is in South Africa");
	}

	public static void main(String[] args) {
		WhiteRhito r = new WhiteRhito();
		//WhiteRhito s = new WhiteRhito("s");
	}
}