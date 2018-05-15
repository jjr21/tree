package oca;

public class MathInt {
	private static IntDeclare setDeclare;
	public static void main(String[] args) {
		//IntDeclare b = new IntDeclare();
		setDeclare = getMethod();
		int c = 0, d =0, e =0;
		c = setDeclare.x;
		d = setDeclare.y;
		e= c/d;
		System.out.println(e);
		System.exit(0);
	}
	public static IntDeclare getMethod() {
		return new IntDeclare();
	}
}
