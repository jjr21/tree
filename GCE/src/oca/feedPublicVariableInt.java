package oca;

public class feedPublicVariableInt {

	static testPublicVariableInt obj;
	public static void main(String[] args) {
		obj = setObj();
		obj.width = 10;
		obj.print();
	}
	public static testPublicVariableInt setObj() {
		return new testPublicVariableInt();
	}
}
