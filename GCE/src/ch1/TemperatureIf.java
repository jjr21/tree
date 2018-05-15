  package ch1;

import javax.swing.JOptionPane;

public class TemperatureIf {

	public static void main(String[] args) {
		int degree;
		String input;
		
		input = JOptionPane.showInputDialog("Enter the temperature : ");
		degree = Integer.parseInt(input);
		int x, y;

		if (degree > 100) {
			JOptionPane.showMessageDialog(null, "No shirt!");
		}

		else if (degree > 80 ){
			JOptionPane.showMessageDialog(null, "Wear T-shirt");
		}
		
		else if (degree > 60 ){
			JOptionPane.showMessageDialog(null, "Wear sweatshirt or  hoodies");
		}
		else if (degree >40) {
			JOptionPane.showMessageDialog(null, "Wear the thin jacket");
		}

		else if (degree > 20 ){
			JOptionPane.showMessageDialog(null, "Wear the thick jacket");
		}
		else {
			JOptionPane.showMessageDialog(null, "stay home and get in hot spa");
		}
		System.exit(0);
	}
}
