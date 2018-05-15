package ch1;

import javax.swing.JOptionPane;

public class global {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello Earth!");
		BacktoEarth();
		Deep();
		System.out.println("Bye planets");
		
		System.exit(0);
	}
	
	public static void BacktoEarth() {
		String b = "Hello from Mars";
		System.out.println(b);
	}
	public static void Deep(){
	
		System.out.println("Hello from Jupiter");
		Deeper();
		System.out.println("Hello again from Jupiter");
	}
	public static void Deeper() {
		System.out.println("Hello from Saturn");
	}
}
