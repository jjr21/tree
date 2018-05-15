package oca;

public class DeclareIandJ {

	private int i =6;
	private int j = i;
	public void DeclareIandJ() {
		i = 5;
	}
	public static void main(String[] args) {
		DeclareIandJ a = new DeclareIandJ();
		System.out.print(a.i + a.j + " ");
		a.DeclareIandJ();
		System.out.println(a.i + a.j);
		System.exit(0);
	}
}
