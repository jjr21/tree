package oca;

public class NullPointException {
public static String name;
	
	public void eat() throws NullPointerException{
		try {
			System.out.println("NULL");
			e();
		}
		finally {
			System.out.println("NULL NULL NULL");			
		}
		
		
		
	}
	public static void main(String[] args) {
		NullPointException nullB = new NullPointException();
		//name = "JJ";
		nullB.eat();
		System.out.println("pass the Null Exception");
	}
	public static void e() {
		throw new NullPointerException();
	}
}
