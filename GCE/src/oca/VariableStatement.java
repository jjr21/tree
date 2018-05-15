package oca;

public class VariableStatement {

	public VariableStatement() {
		int c = 1;
		
		
		if(++c <2) {
			System.out.println(c + "   ");
			c = 5;
		}
		System.out.print(c);
		
	}
	public void jump() {
		int time =11;
		int day =4;
		String dinner = time> 10 ?  "Takeout" : "Leftover";
		System.out.println(dinner);
		int c = 10 + (5 * (4+3));
		System.out.print(1 + 4+3+"9"+3);
		System.out.print("  " +11/3  +"   "+ 11%3);
	}
	public static void main(String[] unsed) {
		new VariableStatement();
		VariableStatement a = new VariableStatement();
		a.jump();
	}
}
