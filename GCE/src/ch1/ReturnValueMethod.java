package ch1;

public class ReturnValueMethod {

	public static void main(String[] args) {
		int total, b=3, c=9;
		total = sum(b, c);
		
		System.out.println("the X is " + b + "  the Y is  " + 
		c + " the total is : " +  total);
		
		System.exit(0);
	}
	public static int sum(int x, int y) {
		int result;
		result = x + y;
		return result;
		
	}
}
