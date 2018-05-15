package Inheritance;

import javax.swing.JOptionPane;

public class GetPlanet {

		
	public static void main(String[] args) {
		String input;
		int number;
		
		input = JOptionPane.showInputDialog("Enter your name: ");
		
		SubSubClass sub = new SubSubClass();
		sub.subClass(input);
		input = JOptionPane.showInputDialog("Enter your number: ");
		number = Integer.parseInt(input); 
		sub.SubClass(number);

		sub.SuperClass(number);
	}
}
