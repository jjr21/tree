package Interface;

import javax.swing.JOptionPane;

public class BeeClass {

	private static Bee sting;
	
	public static void main(String[] args) {
		sting = setSting();
		String input = JOptionPane.showInputDialog("Enter the kind of bee : ");
		sting.setKind(input);
		input = JOptionPane.showInputDialog("Enter the bee's color ");
		sting.setColorBee(input);
		sting.setStatus(true);
		input = JOptionPane.showInputDialog("Enter the kind of wasp");
		sting.setWasp(input);
		System.out.println(sting.toString());
		System.exit(0);
	}
	public static Bee setSting() {
		return new Bee();
	}
}
