package ch1;

import javax.swing.JOptionPane;

public class DogAge {

	public static void main(String[] args) {
		String stringAge;
		int age;
		stringAge = JOptionPane.showInputDialog("Enter your dog's age:");
		age = Integer.parseInt(stringAge);
		FindAgeAsHuman(age);
		System.exit(0);
		
	}
	
	public static void FindAgeAsHuman(int ch) {
		JOptionPane.showMessageDialog(null, "Your dog's age is  " + ch);
		int HumanAge = ch* 7;
		JOptionPane.showMessageDialog(null, "Your dog's age as human:  " + HumanAge);
	}
}
