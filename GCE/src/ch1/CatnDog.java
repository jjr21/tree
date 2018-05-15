package ch1;

import javax.swing.JOptionPane;

public class CatnDog {

	public static void main(String[] args) {
		int catAge;
		int dogAge;
		String firstNumber;
		firstNumber = "2d";
		String c;
		String d;
		String name;
		c = JOptionPane.showInputDialog("Enter your cat's age :  ");
		catAge = Integer.parseInt(c);
		d= JOptionPane.showInputDialog("Enter your dog's age :  ");
		dogAge = Integer.parseInt(d);
		getAge(catAge, dogAge);
		name = JOptionPane.showInputDialog("enter your pet name  : ");
		getName(name);
		System.exit(0);
	}
	
	public static void getAge(int cc, int dd) {
		int cc2;
		int dd2;
		cc2= cc*7;
		dd2 = dd*7;
		JOptionPane.showMessageDialog(null, "Your cat's age as human is :  " + cc2);
		JOptionPane.showMessageDialog(null, "Your dog's age as human is :   " + dd2);
	}
	public static void getName(String str) {
		JOptionPane.showMessageDialog(null, "Your pet's name :   " + str);
	}
}
