package Interface;

import javax.swing.JOptionPane;

public class BeachDay extends Surf{
	private static int numberHold;
	public static void main(String[] args) {
		String hold;
		int numberSub;
		Surf surf = new Surf();
		hold = JOptionPane.showInputDialog("Enter the water temperature :");
		//numberHold = Integer.parseInt(hold);

		//surf.setTemp(numberHold);
		verfityNumber(hold);
		
		numberSub = getTemp();
		surf.setTemp(numberSub);
		
		hold = JOptionPane.showInputDialog("Enter the speed windy :");
		verfityNumber(hold);
		numberSub = getTemp();
		surf.setWindy(numberSub);
		
		hold = JOptionPane.showInputDialog("Enter the length of wave :");
		verfityNumber(hold);
		numberSub = getTemp();
		surf.setWave(numberSub);
		
		JOptionPane.showMessageDialog(null, "Temp : " + surf.getTemp2() + " Windy : " + surf.getWindy() +
				" Length of wave : " + surf.getWave());
	}
	
	
	public static void verfityNumber(String hold) {
		try {
			numberHold = Integer.parseInt(hold);
		
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Only number");
		}
	
	}
	
	public static int getTemp() {
		return numberHold;
	}
	
	
	

}
