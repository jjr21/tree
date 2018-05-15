package Interface;

import javax.swing.JOptionPane;

public class WeatherGuy {
	public static void main(String[] args) {
		Temp tmp = new Temp();
		int i;
		String hold = JOptionPane.showInputDialog("Enter the degree :");
		i = Integer.parseInt(hold);
		try {  
			i = Integer.parseInt(hold);
		}
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Only number");
		}
		
		tmp.setDegree(i);
		int g = tmp.getDegree();
		if (g < 45) {
			JOptionPane.showMessageDialog(null, "outside is cold, the temperature : " + g );
		}
		else {
			JOptionPane.showMessageDialog(null, "outside is warm, the temperature : " + g);
		}
		System.exit(0);
	}

}
