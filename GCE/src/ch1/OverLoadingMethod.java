package ch1;

public class OverLoadingMethod {
	private double balance;
	
	public OverLoadingMethod() {
		balance = 0.0;
	}
	
	public OverLoadingMethod (double d) {
		balance = d;
	}
	
	public OverLoadingMethod (String a) {
		balance = Double.parseDouble(a);
	}
	
	public void deposit(double amount) {
		balance += amount;
	
	}
	
	public void deposit(String str) {
		balance += Double.parseDouble(str);
	}
	
	public void withdraw(double w) {
		balance -= w;
	}
	
	public void withdraw(String str) {
		balance -= Double.parseDouble(str);
	}
	
	public void setBalance(double b) {
		balance = b;
	}
	public void setBalance (String s) {
		balance = Double.parseDouble(s);
	}
	
	public double getBalance() {
		return balance;
	}
	

}
