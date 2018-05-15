package ch1;

import javax.swing.JOptionPane;

public class CountName {

	public static void main(String[] args) {
		String name1;
		name1 = JOptionPane.showInputDialog("Enter your name: ");
		Count(name1);
		System.exit(0);
	}
	
	public static void Count(String str) {
		JOptionPane.showMessageDialog(null, "The length of your name is " + str.length());
	}
}
