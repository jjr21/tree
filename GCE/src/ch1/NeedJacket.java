package ch1;

import javax.swing.JOptionPane;

public class NeedJacket {

	public static void main(String[] args) {
		String Stringtemp;
		int temp;
		Stringtemp = JOptionPane.showInputDialog("Please enter the temperature: ");
		temp = Integer.parseInt(Stringtemp);
		
		
		if (temp > 65) {
			Hot();
		}
		else {
			Freeze();
		}
		System.exit(0);

	}
	
	public static void Freeze() {
		JOptionPane.showMessageDialog(null, "Wear the jacket!");
	}
	
	public static void Hot() {
		JOptionPane.showMessageDialog(null, "Wear T-shirt!");
	}
}
